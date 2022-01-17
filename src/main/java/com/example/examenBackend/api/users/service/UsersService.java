package com.example.examenBackend.api.users.service;
import com.example.examenBackend.api.users.to.UsersTO;

public interface UsersService {

    UsersTO getUsersById(Long idUser);

    UsersTO addUsers(UsersTO usersTO);

    void deleteUsersById(Long idUser);
}
