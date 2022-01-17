package com.example.examenBackend.api.loans.facade;

import com.example.examenBackend.api.loans.service.LoansService;
import com.example.examenBackend.api.loans.to.LoansPagedTO;
import com.example.examenBackend.api.loans.to.LoansTO;
import com.example.examenBackend.api.loans.to.PagedTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LoansFacade {

    private final LoansService loansService;

    public LoansPagedTO getAllLoansPaged(Long page, Long size, Long userId) {

        List<LoansTO> loansTOList;
        PagedTO pagedTO;

        if (userId != null) {

            loansTOList = this.loansService.getAllLoansPagedByUserId(page, size, userId);
            pagedTO = PagedTO.builder()
                    .page(page)
                    .size(size)
                    .total(this.loansService.getAllLoansPagedByUserIdRowsTotal(page, size, userId))
                    .build();

        } else {

            loansTOList = this.loansService.getAllLoansPaged(page, size);
            pagedTO = PagedTO.builder()
                    .page(page)
                    .size(size)
                    .total(this.loansService.getAllLoansPagedRowsTotal(page, size))
                    .build();

        }
        
        return LoansPagedTO.builder()
                .items(loansTOList)
                .paging(pagedTO)
                .build();
    }
}
