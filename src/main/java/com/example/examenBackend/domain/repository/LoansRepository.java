package com.example.examenBackend.domain.repository;

import com.example.examenBackend.domain.entity.LoansDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends JpaRepository<LoansDE, Long> {

    @Query(value = "SELECT * from Loans l \n" +
            "WHERE l.USER_ID = ?1 ;", nativeQuery = true)
    List<LoansDE> getAllLoansByUserId(Long idUser);

    @Query(value = "SELECT * \n" +
            "FROM Loans l \n" +
            "ORDER BY l.ID_LOAN \n" +
            "OFFSET ?1 ROWS FETCH NEXT ?2 ROWS ONLY ;", nativeQuery = true)
    List<LoansDE> getAllLoansPaged(Long offsetRows, Long nextRows);

    @Query(value = "SELECT COUNT(*) OVER () as ROWS_TOTAL \n" +
            "FROM Loans l \n" +
            "ORDER BY l.ID_LOAN \n" +
            "OFFSET ?1 ROWS FETCH NEXT ?2 ROWS ONLY ;", nativeQuery = true)
    Long getAllLoansPagedRowsTotal(Long offsetRows, Long nextRows);

    @Query(value = "SELECT * \n" +
            "FROM Loans l \n" +
            "WHERE l.USER_ID = ?3 \n" +
            "ORDER BY l.ID_LOAN \n" +
            "OFFSET ?1 ROWS FETCH NEXT ?2 ROWS ONLY ;", nativeQuery = true)
    List<LoansDE> getAllLoansPagedByUserId(Long offsetRows, Long nextRows, Long userId);

    @Query(value = "SELECT COUNT(*) OVER () as ROWS_TOTAL \n" +
            "FROM Loans l \n" +
            "WHERE l.USER_ID = ?3 \n" +
            "ORDER BY l.ID_LOAN \n" +
            "OFFSET ?1 ROWS FETCH NEXT ?2 ROWS ONLY ;", nativeQuery = true)
    Long getAllLoansPagedByUserIdRowsTotal(Long offsetRows, Long nextRows, Long userId);
}
