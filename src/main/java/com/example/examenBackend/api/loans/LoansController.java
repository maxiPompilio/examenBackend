package com.example.examenBackend.api.loans;

import com.example.examenBackend.api.loans.facade.LoansFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class LoansController implements LoansAPI {

    private final LoansFacade loansFacade;

    @Override
    public ResponseEntity<Object> getAllLoans(Long page, Long size, Long userId) {
        return ResponseEntity.status(HttpStatus.OK).body(this.loansFacade.getAllLoansPaged(page, size, userId));
    }
}
