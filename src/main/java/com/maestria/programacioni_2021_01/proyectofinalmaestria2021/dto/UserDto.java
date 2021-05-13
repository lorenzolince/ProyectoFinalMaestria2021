package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto;

/**
 *
 * @author lorenzolince
 */
public class UserDto {

    private int id;
    private String user;
    private String password;
    private String name;

    public int getId() {
        return id;
    }

    public UserDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getUser() {
        return user;
    }

    public UserDto setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserDto setName(String name) {
        this.name = name;
        return this;
    }

}
