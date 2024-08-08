package com.microserviceFirst.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {


    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
