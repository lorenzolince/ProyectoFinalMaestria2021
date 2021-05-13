package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.impl;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.UserDao;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.impl.UserDaoImpl;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.UserDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.UserService;
import java.util.List;

/**
 *
 * @author lorenzolince
 */
public class UserServiceImpl implements UserService {

    private UserDao user;

    public UserServiceImpl() {
        this.user = new UserDaoImpl();

    }

    @Override
    public List<UserDto> getAll() {
       return  this.user.getAll();
    }

    @Override
    public UserDto getById(int id) {
       return  this.user.getById(id);
    }

    @Override
    public UserDto getByUserName(String userName) {
        return this.user.getByUserName(userName);
    }

  

}
