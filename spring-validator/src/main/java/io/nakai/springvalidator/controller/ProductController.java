package io.nakai.springvalidator.controller;

import io.nakai.springvalidator.dto.ProductDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @PostMapping
    public String save(@Valid @RequestBody ProductDTO product) {
        return product.toString();
    }
}
