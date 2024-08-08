package com.microserviceFirst.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {

    private String name;

    private String email;

    private String mobileNumber;

    private AccountDto accountDto;
}
