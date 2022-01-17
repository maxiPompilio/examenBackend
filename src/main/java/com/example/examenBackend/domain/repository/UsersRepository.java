package com.example.examenBackend.domain.repository;

import com.example.examenBackend.domain.entity.UsersDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersDE, Long> {

    @Query(value = "SELECT * FROM Users u \n" +
            "WHERE u.ID_USER = ?1 ;", nativeQuery = true)
    UsersDE getUsersById(Long idUser);
}
