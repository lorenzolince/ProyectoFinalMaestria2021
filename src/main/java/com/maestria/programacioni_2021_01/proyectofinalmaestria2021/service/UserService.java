
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.UserDto;
import java.util.List;

/**
 *
 * @author lorenzolince
 */
public interface UserService {

    public List<UserDto> getAll();

    public UserDto getById(int id);

    public UserDto getByUserName(String userName);
}
