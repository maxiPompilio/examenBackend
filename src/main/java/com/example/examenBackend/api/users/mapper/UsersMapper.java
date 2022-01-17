package com.example.examenBackend.api.users.mapper;
import com.example.examenBackend.api.users.to.UsersTO;
import com.example.examenBackend.domain.entity.UsersDE;
import org.springframework.stereotype.Component;

@Component
public class UsersMapper {

    public static UsersTO fromUsersDE(UsersDE usersDE) {
        return UsersTO.builder()
                .id(usersDE.getIdUser())
                .email(usersDE.getEmail())
                .firstName(usersDE.getFirstName())
                .lastName(usersDE.getLastName())
                .build();
    }

    public static UsersDE fromUsersTO(UsersTO usersTO) {
        return UsersDE.builder()
                .idUser(usersTO.getId())
                .email(usersTO.getEmail())
                .firstName(usersTO.getFirstName())
                .lastName(usersTO.getLastName())
                .build();
    }
}
