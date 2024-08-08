package com.microserviceFirst.repository;

import com.microserviceFirst.dto.CustomerDto;
import com.microserviceFirst.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


    Optional<Customer> findByMobileNumber(String mobileNumber);


}
