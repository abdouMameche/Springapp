package testtech.service;



import testtech.dto.UserDTO;
import testtech.entity.User;

import java.util.List;

public interface UserService {
    User registerUser(UserDTO userDTO);
    User updateUser(Long id, UserDTO userDTO);
    List<User> searchUsers(String keyword);
    User getUserDetails(Long id);
    void deleteUser(Long id);
}
