
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author lorenzolince
 */
public class PoolConnection {

    static private PoolConnection instance;
    private int checkedOut;
    private Vector freeConnections = new Vector();
    static private int maxConn = 0;
    static private String driver_class = "net.ucanaccess.jdbc.UcanaccessDriver";
    static private String URL = "jdbc:ucanaccess://DATOS.accdb";

    static synchronized public PoolConnection getInstance() {
        if (instance == null) {
            try {
                maxConn = 50;
                Class.forName(driver_class);
                instance = new PoolConnection();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return instance;
    }

    public synchronized Connection getConnection() {
        Connection con = null;
        while ((con = getOneConnection()) == null) {
        }
        checkedOut++;
        return con;
    }

    public synchronized void freeConnection(Connection con) {
        if (con != null) {
            freeConnections.addElement(con);
        }
        checkedOut--;
        notifyAll();
    }

    private Connection getOneConnection() {
        Connection con = null;
        if (freeConnections.size() > 0) {
            con = (Connection) freeConnections.firstElement();
            freeConnections.removeElementAt(0);
            try {
                con.rollback();
            } catch (SQLException e) {
                con = getOneConnection();
            }
        } else if (maxConn == 0 || checkedOut < maxConn) {
            con = newConnection();
        }
        if (con == null) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
            con = getOneConnection();
        }
        return con;
    }

    public synchronized void release() {
        Enumeration allConnections = freeConnections.elements();
        while (allConnections.hasMoreElements()) {
            Connection con = (Connection) allConnections.nextElement();
            try {
                con.close();
            } catch (SQLException e) {
            }
        }
        freeConnections.removeAllElements();
        checkedOut = 0;
    }

    private Connection newConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL);

        } catch (SQLException e) {
            return null;
        }

        return con;
    }

}
