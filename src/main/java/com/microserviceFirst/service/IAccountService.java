package com.microserviceFirst.service;

import com.microserviceFirst.dto.CustomerDto;
import com.microserviceFirst.entity.Account;

public interface IAccountService {


    /**
     *
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return
     */
    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);
}
