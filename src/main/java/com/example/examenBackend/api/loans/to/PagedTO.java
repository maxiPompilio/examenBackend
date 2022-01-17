package com.example.examenBackend.api.loans.to;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PagedTO {

    Long page;
    Long size;
    Long total;
}
