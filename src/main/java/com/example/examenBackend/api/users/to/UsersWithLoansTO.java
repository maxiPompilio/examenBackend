package com.example.examenBackend.api.users.to;

import com.example.examenBackend.api.loans.to.LoansTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UsersWithLoansTO {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private List<LoansTO> loans;
}
