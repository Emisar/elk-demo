package com.example.elkdemo.controller;

import com.example.elkdemo.entity.Order;
import com.example.elkdemo.service.impl.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import static com.example.elkdemo.consts.LoggingMessages.CALLING_METHOD;

@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/add")
    public boolean addOrder(Order order) {
        log.info(CALLING_METHOD, "create");
        return Objects.nonNull(orderService.create(order));
    }

    @GetMapping("/get")
    public Order getOrder(@RequestParam Long id) {
        log.info(CALLING_METHOD, "read");
        return orderService.read(id);
    }

    @GetMapping("/getAll")
    public List<Order> getAllOrders() {
        log.info(CALLING_METHOD, "readAll");
        return orderService.readAll();
    }

    @PatchMapping("/update")
    public boolean updateOrder(@RequestParam Long id, @RequestBody Order order) {
        log.info(CALLING_METHOD, "update");
        return Objects.nonNull(orderService.update(id, order));
    }

    @DeleteMapping("/delete")
    public boolean deleteOrder(@RequestParam Long id) {
        log.info(CALLING_METHOD, "delete");
        return Objects.nonNull(orderService.delete(id));
    }
}
