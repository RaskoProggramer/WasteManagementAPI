package com.enviro.assessment.grad001.mphorakgope.service;

import com.enviro.assessment.grad001.mphorakgope.exception.ResourceNotFoundException;
import com.enviro.assessment.grad001.mphorakgope.model.Waste;
import com.enviro.assessment.grad001.mphorakgope.repository.WasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteService implements WasteCategoryService{
    @Autowired
    private WasteRepository repository;

    @Override
    public Waste saveWaste(Waste category) {
        return repository.save(category);
    }

    @Override
    public Waste updateWaste(Long id, Waste category) {
        Waste existingCategory = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id " + id));
        existingCategory.setCategoryName(category.getCategoryName());
        existingCategory.setDisposalGuideline(category.getDisposalGuideline());
        existingCategory.setRecyclingTips(category.getRecyclingTips());
        return repository.save(existingCategory);
    }

    @Override
    public void deleteWaste(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Category not found with id " + id);
        }
        repository.deleteById(id);
    }

    @Override
    public Waste getWasteById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with id " + id));
    }

    @Override
    public List<Waste> getAllWaste() {
        return repository.findAll();
    }
}
