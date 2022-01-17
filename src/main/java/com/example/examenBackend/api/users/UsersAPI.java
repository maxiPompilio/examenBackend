package com.example.examenBackend.api.users;

import com.example.examenBackend.api.users.to.UsersTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface UsersAPI {

    @RequestMapping(value = "/users/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    ResponseEntity<Object> getUsersWithLoansByID(@PathVariable(value = "id") Long idUser);

    @RequestMapping(value = "/users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST)
    ResponseEntity<Object> addUsers(@RequestBody UsersTO usersTO);

    @RequestMapping(value = "/users/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.DELETE)
    ResponseEntity<Object> deleteUsers(@PathVariable(value = "id") Long idUser);
}
