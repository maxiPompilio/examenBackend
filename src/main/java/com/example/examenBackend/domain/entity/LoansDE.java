package com.example.examenBackend.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Loans", schema = "dbo")
public class LoansDE implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LOAN")
    private Long idLoan;

    @Column(name = "TOTAL")
    private BigDecimal total;

    @Column(name = "USER_ID")
    private Long userId;
}
