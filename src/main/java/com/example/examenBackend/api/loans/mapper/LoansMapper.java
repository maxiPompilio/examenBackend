package com.example.examenBackend.api.loans.mapper;

import com.example.examenBackend.api.loans.to.LoansTO;
import com.example.examenBackend.domain.entity.LoansDE;
import org.springframework.stereotype.Component;

@Component
public class LoansMapper {

    public static LoansTO fromLoansDE(LoansDE loansDE) {
        return LoansTO.builder()
                .id(loansDE.getIdLoan())
                .total(loansDE.getTotal())
                .userId(loansDE.getUserId())
                .build();
    }

    public static LoansDE fromLoansTO(LoansTO loansTO) {
        return LoansDE.builder()
                .idLoan(loansTO.getId())
                .total(loansTO.getTotal())
                .userId(loansTO.getUserId())
                .build();
    }
}
