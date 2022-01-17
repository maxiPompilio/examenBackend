package com.example.examenBackend.api.loans.service;

import com.example.examenBackend.api.loans.to.LoansTO;

import java.util.List;

public interface LoansService {

    List<LoansTO> getAllLoansByUserId(Long userId);

    List<LoansTO> getAllLoansPaged(Long page, Long size);

    Long getAllLoansPagedRowsTotal(Long page, Long size);

    List<LoansTO> getAllLoansPagedByUserId(Long page, Long size, Long userId);

    Long getAllLoansPagedByUserIdRowsTotal(Long page, Long size, Long userId);

    void deleteAllLoansByUserId(Long userId);
}
