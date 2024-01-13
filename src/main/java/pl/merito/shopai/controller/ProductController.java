package pl.merito.shopai.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.merito.shopai.model.Product;
import pl.merito.shopai.model.ProductRequest;
import pl.merito.shopai.model.ProductResponse;
import pl.merito.shopai.service.ProductService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public void createProduct(@ModelAttribute ProductRequest request) {
        productService.createProduct(request);
    }
}