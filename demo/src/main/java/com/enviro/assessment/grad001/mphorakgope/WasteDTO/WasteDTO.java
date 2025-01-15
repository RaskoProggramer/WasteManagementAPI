package com.enviro.assessment.grad001.mphorakgope.WasteDTO;

import jakarta.validation.constraints.NotBlank;

public class WasteDTO {

    private Long id;

    @NotBlank(message = "Category name is required")
    private String categoryName;

    @NotBlank(message = "Disposal guidelines are required")
    private String disposalGuidelines;

    @NotBlank(message = "Recycling tips are required")
    private String recyclingTips;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDisposalGuidelines() {
        return disposalGuidelines;
    }

    public void setDisposalGuidelines(String disposalGuidelines) {
        this.disposalGuidelines = disposalGuidelines;
    }

    public String getRecyclingTips() {
        return recyclingTips;
    }

    public void setRecyclingTips(String recyclingTips) {
        this.recyclingTips = recyclingTips;
    }
}
