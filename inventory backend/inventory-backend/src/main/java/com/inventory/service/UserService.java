package com.inventory.service;


import com.inventory.dto.UserDTO;

import java.util.List;

public interface UserService {
    public UserDTO createUser(UserDTO userDTO);
    public UserDTO getUserById(int userId);
    public UserDTO deleteUserById(int userId);
    public List<UserDTO> getAllUser();
    public UserDTO updateUserById(int userId, UserDTO updatedUserDTO);
}
