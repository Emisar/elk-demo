package com.example.elkdemo.controller;

import com.example.elkdemo.entity.*;
import com.example.elkdemo.service.impl.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static com.example.elkdemo.consts.LoggingMessages.*;

@Slf4j
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/add")
    public boolean addCustomer(@RequestBody Customer customer) {
        log.info(CALLING_METHOD, "create", Customer.class);
        return Objects.nonNull(customerService.create(customer));
    }

    @GetMapping("/get")
    public Customer getCustomer(@RequestParam Long id) {
        log.info(CALLING_METHOD, "read", Customer.class);
        return customerService.read(id);
    }

    @GetMapping("/getAll")
    public List<Customer> getAllCustomers() {
        log.info(CALLING_METHOD, "readAll", Customer.class);
        return customerService.readAll();
    }

    @PatchMapping("/update")
    public boolean updateCustomer(@RequestParam Long id, @RequestBody Customer customer) {
        log.info(CALLING_METHOD, "update", Customer.class);
        return Objects.nonNull(customerService.update(id, customer));
    }

    @DeleteMapping("/delete")
    public boolean deleteCustomer(@RequestParam Long id) {
        log.info(CALLING_METHOD, "delete", Customer.class);
        return customerService.delete(id);
    }
}
