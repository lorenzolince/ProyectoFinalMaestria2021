/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.impl;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.TiposDao;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.impl.TiposDaoImpl;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.TipoDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.TiposService;
import java.util.List;

/**
 *
 * @author loren
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
