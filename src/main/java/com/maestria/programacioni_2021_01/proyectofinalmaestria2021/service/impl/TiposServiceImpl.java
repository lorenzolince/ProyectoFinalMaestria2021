
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.impl;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.TiposDao;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.impl.TiposDaoImpl;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.TipoDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.TiposService;
import java.util.List;

/**
 *
 * @author lorenzolince
 */
public class TiposServiceImpl implements TiposService {
    
   private TiposDao tiposDao;
   
   public TiposServiceImpl(){
   this.tiposDao = new TiposDaoImpl();
   }

    @Override
    public List<TipoDto> getAll() {
       return  this.tiposDao.getAll();
    }
    
}
