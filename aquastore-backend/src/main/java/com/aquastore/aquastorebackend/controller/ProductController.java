package com.aquastore.aquastorebackend.controller;

import com.aquastore.aquastorebackend.entity.Product;
import com.aquastore.aquastorebackend.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        List<Product> products = productService.getAllProducts();

        if (products.isEmpty()) {
            return ResponseEntity.ok("No products found");
        }

        return ResponseEntity.ok(products);
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);

        return ResponseEntity.ok(product);
    }

    // CREATE
    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        productService.createProduct(product);

        return ResponseEntity.ok("Product successfully created");
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduct(
            @PathVariable Long id,
            @RequestBody Product product) {

        productService.updateProduct(id, product);

        return ResponseEntity.ok("Product successfully updated");
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {

        productService.deleteProduct(id);

        return ResponseEntity.ok("Product successfully deleted");
    }
}