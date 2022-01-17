package com.example.examenBackend.api.loans.to;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoansPagedTO {

    List<LoansTO> items;
    PagedTO paging;
}
