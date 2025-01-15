package com.enviro.assessment.grad001.mphorakgope.controller;

import com.enviro.assessment.grad001.mphorakgope.model.Waste;
import com.enviro.assessment.grad001.mphorakgope.service.WasteCategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waste")
public class WasteController {
    @Autowired
    private WasteCategoryService service;

    @PostMapping
    public ResponseEntity<Waste> createCategory(@Valid @RequestBody Waste category) {
        return ResponseEntity.ok(service.saveWaste(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Waste> updateCategory(@PathVariable Long id, @Valid @RequestBody Waste category) {
        return ResponseEntity.ok(service.updateWaste(id, category));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        service.deleteWaste(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Waste> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getWasteById(id));
    }

    @GetMapping
    public ResponseEntity<List<Waste>> getAllCategories() {
        return ResponseEntity.ok(service.getAllWaste());
    }
}
