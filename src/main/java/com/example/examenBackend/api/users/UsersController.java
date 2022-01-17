package com.example.examenBackend.api.users;

import com.example.examenBackend.api.users.facade.UsersFacade;
import com.example.examenBackend.api.users.to.UsersTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UsersController implements UsersAPI{

    private final UsersFacade usersFacade;

    @Override
    public ResponseEntity<Object> getUsersWithLoansByID(Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.usersFacade.getUsersWithLoansById(id));
    }

    @Override
    public ResponseEntity<Object> addUsers(UsersTO usersTO) {
        return ResponseEntity.status(HttpStatus.OK).body(this.usersFacade.addUsers(usersTO));
    }

    @Override
    public ResponseEntity<Object> deleteUsers(Long idUser) {
        return ResponseEntity.status(HttpStatus.OK).body(this.usersFacade.deleteUsersWithLoansById(idUser));
    }
}
