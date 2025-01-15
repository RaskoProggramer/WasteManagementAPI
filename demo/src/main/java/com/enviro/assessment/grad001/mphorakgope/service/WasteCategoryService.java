package com.enviro.assessment.grad001.mphorakgope.service;
import com.enviro.assessment.grad001.mphorakgope.model.Waste;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WasteCategoryService {
    Waste saveWaste(Waste category);
    Waste updateWaste(Long id, Waste category);
    void deleteWaste(Long id);
    Waste getWasteById(Long id);
    List<Waste> getAllWaste();
}
