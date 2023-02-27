package com.example.elkdemo.controller;

import com.example.elkdemo.entity.*;
import com.example.elkdemo.service.impl.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.aspectj.weaver.ast.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static com.example.elkdemo.consts.LoggingMessages.*;

@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final CustomerService customerService;
    private final ProductService productService;

    @PostMapping("/add")
    public boolean addOrder(@RequestParam Long customerId, @RequestParam Long productId) {
        log.info(CALLING_METHOD, "create", Order.class);
        Customer customer = customerService.read(customerId);
        Product product = productService.read(productId);
        return Objects.nonNull(orderService.create(new Order(customer, product)));
    }

    @GetMapping("/get")
    public Order getOrder(@RequestParam Long id) {
        log.info(CALLING_METHOD, "read", Order.class);
        return orderService.read(id);
    }

    @GetMapping("/getAll")
    public List<Order> getAllOrders() {
        log.info(CALLING_METHOD, "readAll", Order.class);
        return orderService.readAll();
    }

    @DeleteMapping("/delete")
    public boolean deleteOrder(@RequestParam Long id) {
        log.info(CALLING_METHOD, "delete", Order.class);
        return orderService.delete(id);
    }
}
