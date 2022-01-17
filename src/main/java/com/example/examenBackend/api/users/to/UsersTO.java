package com.example.examenBackend.api.users.to;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UsersTO {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
}
