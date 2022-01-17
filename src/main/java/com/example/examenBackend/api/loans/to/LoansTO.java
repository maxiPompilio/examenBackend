package com.example.examenBackend.api.loans.to;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoansTO {

    private Long id;
    private BigDecimal total;
    private Long userId;
}
