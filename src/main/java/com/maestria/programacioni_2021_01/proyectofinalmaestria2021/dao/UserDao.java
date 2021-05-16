/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.UserDto;
import java.util.List;

/**
 *
 * @author lorenzolince
 */
public interface UserDao {

    public List<UserDto> getAll();

    public UserDto getById(int id);

    public UserDto  getByUserName(String userName);
}
