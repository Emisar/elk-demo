package com.example.elkdemo.controller;

import com.example.elkdemo.entity.Product;
import com.example.elkdemo.service.impl.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import static com.example.elkdemo.consts.LoggingMessages.CALLING_METHOD;

@Slf4j
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/add")
    public boolean addProduct(@RequestBody Product product) {
        log.info(CALLING_METHOD, "create");
        return Objects.nonNull(productService.create(product));
    }

    @GetMapping("/get")
    public Product getProduct(@RequestParam Long id) {
        log.info(CALLING_METHOD, "read");
        return productService.read(id);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts() {
        log.info(CALLING_METHOD, "readAll");
        return productService.readAll();
    }

    @PatchMapping("/update")
    public boolean updateProduct(@RequestParam Long id, @RequestBody Product product) {
        log.info(CALLING_METHOD, "update");
        return Objects.nonNull(productService.update(id, product));
    }

    @DeleteMapping("/delete")
    public boolean deleteProduct(@RequestParam Long id) {
        log.info(CALLING_METHOD, "delete");
        return Objects.nonNull(productService.delete(id));
    }
}
