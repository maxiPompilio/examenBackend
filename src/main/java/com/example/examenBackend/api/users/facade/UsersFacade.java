package com.example.examenBackend.api.users.facade;

import com.example.examenBackend.api.loans.service.LoansService;
import com.example.examenBackend.api.loans.to.LoansTO;
import com.example.examenBackend.api.users.service.UsersService;
import com.example.examenBackend.api.users.to.UsersTO;
import com.example.examenBackend.api.users.to.UsersWithLoansTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@RequiredArgsConstructor
public class UsersFacade {

    private final UsersService usersService;
    private final LoansService loansService;

    public UsersWithLoansTO getUsersWithLoansById(Long id) {

        List<LoansTO> loans = this.loansService.getAllLoansByUserId(id);
        UsersTO usersTO = this.usersService.getUsersById(id);

        return UsersWithLoansTO.builder()
                .id(usersTO.getId())
                .email(usersTO.getEmail())
                .firstName(usersTO.getFirstName())
                .lastName(usersTO.getLastName())
                .loans(loans)
                .build();
    }

    public UsersTO addUsers(UsersTO usersTO) {
        return this.usersService.addUsers(usersTO);
    }

    @Transactional
    public Boolean deleteUsersWithLoansById(Long idUser) {

        this.loansService.deleteAllLoansByUserId(idUser);
        this.usersService.deleteUsersById(idUser);

        return true;
    }
}
