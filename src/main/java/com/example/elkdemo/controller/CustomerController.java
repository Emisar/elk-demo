package com.example.elkdemo.controller;

import com.example.elkdemo.entity.Customer;
import com.example.elkdemo.service.impl.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import static com.example.elkdemo.consts.LoggingMessages.CALLING_METHOD;

@Slf4j
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/add")
    public boolean addCustomer(@RequestBody Customer customer) {
        log.info(CALLING_METHOD, "create");
        return Objects.nonNull(customerService.create(customer));
    }

    @GetMapping("/get")
    public Customer getCustomer(@RequestParam Long id) {
        log.info(CALLING_METHOD, "read");
        return customerService.read(id);
    }

    @GetMapping("/getAll")
    public List<Customer> getAllCustomers() {
        log.info(CALLING_METHOD, "readAll");
        return customerService.readAll();
    }

    @PatchMapping("/update")
    public boolean updateCustomer(@RequestParam Long id, @RequestBody Customer customer) {
        log.info(CALLING_METHOD, "update");
        return Objects.nonNull(customerService.update(id, customer));
    }

    @DeleteMapping("/delete")
    public boolean deleteCustomer(@RequestParam Long id) {
        log.info(CALLING_METHOD, "delete");
        return Objects.nonNull(customerService.delete(id));
    }
}
