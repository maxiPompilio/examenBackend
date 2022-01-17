package com.example.examenBackend.api.loans.service.impl;

import com.example.examenBackend.api.loans.mapper.LoansMapper;
import com.example.examenBackend.api.loans.service.LoansService;
import com.example.examenBackend.api.loans.to.LoansTO;
import com.example.examenBackend.domain.entity.LoansDE;
import com.example.examenBackend.domain.repository.LoansRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LoansServiceImpl implements LoansService {

    private final LoansRepository loansRepository;

    @Override
    public List<LoansTO> getAllLoansByUserId(Long userId) {
        return this.loansRepository.getAllLoansByUserId(userId).stream().map(LoansMapper::fromLoansDE).collect(Collectors.toList());
    }

    @Override
    public List<LoansTO> getAllLoansPaged(Long page, Long size) {
        return this.loansRepository.getAllLoansPaged(((page - 1) * size), size).stream().map(LoansMapper::fromLoansDE).collect(Collectors.toList());
    }

    @Override
    public Long getAllLoansPagedRowsTotal(Long page, Long size) {
        return this.loansRepository.getAllLoansPagedRowsTotal(page, size);
    }

    @Override
    public List<LoansTO> getAllLoansPagedByUserId(Long page, Long size, Long userId) {
        return this.loansRepository.getAllLoansPagedByUserId(((page - 1) * size), size, userId).stream().map(LoansMapper::fromLoansDE).collect(Collectors.toList());
    }

    @Override
    public Long getAllLoansPagedByUserIdRowsTotal(Long page, Long size, Long userId) {
        return this.loansRepository.getAllLoansPagedByUserIdRowsTotal(page, size, userId);
    }

    @Override
    public void deleteAllLoansByUserId(Long userId) {
        List<LoansDE> loansDEList = this.loansRepository.getAllLoansByUserId(userId);
        this.loansRepository.deleteAll(loansDEList);
    }
}
