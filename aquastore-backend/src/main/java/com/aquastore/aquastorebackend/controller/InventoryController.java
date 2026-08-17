package com.aquastore.aquastorebackend.controller;

import com.aquastore.aquastorebackend.entity.Inventory;
import com.aquastore.aquastorebackend.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    // GET ALL
    @GetMapping
    public ResponseEntity<?> getAllInventory() {

        List<Inventory> inventory = inventoryService.getAllInventory();

        if (inventory.isEmpty()) {
            return ResponseEntity.ok("No inventory found");
        }

        return ResponseEntity.ok(inventory);
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getInventoryById(@PathVariable Long id) {

        Inventory inventory = inventoryService.getInventoryById(id);

        return ResponseEntity.ok(inventory);
    }

    // CREATE
    @PostMapping
    public ResponseEntity<String> createInventory(
            @RequestBody Inventory inventory) {

        inventoryService.createInventory(inventory);

        return ResponseEntity.ok("Inventory successfully created");
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<String> updateInventory(
            @PathVariable Long id,
            @RequestBody Inventory inventory) {

        inventoryService.updateInventory(id, inventory);

        return ResponseEntity.ok("Inventory successfully updated");
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteInventory(@PathVariable Long id) {

        inventoryService.deleteInventory(id);

        return ResponseEntity.ok("Inventory successfully deleted");
    }
}