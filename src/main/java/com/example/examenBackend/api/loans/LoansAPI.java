package com.example.examenBackend.api.loans;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface LoansAPI {

    @RequestMapping(value = "/loans",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    ResponseEntity<Object> getAllLoans(@RequestParam("page") Long page, @RequestParam("size") Long size, @RequestParam(value = "user_id", required = false) Long userId);
}
