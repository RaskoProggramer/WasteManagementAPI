package com.enviro.assessment.grad001.mphorakgope.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


import java.util.Objects;

@Entity
public class Waste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "Category name is mandatory")
    private String categoryName;
    @NotBlank(message = "Disposal guideline is mandatory")
    private String disposalGuideline;
    @NotBlank(message = "Recycling tip is mandatory")
    private String recyclingTips;

    public Waste(){}

    public Waste(String categoryName, String disposalGuideline, String recyclingTips){
        this.categoryName = categoryName;
        this.disposalGuideline = disposalGuideline;
        this.recyclingTips = recyclingTips;
    }

    public String getCategoryName(){
        return this.categoryName;
    }

    public  void setCategoryName(String CategoryName){
        this.categoryName = categoryName ;
    }

    public String getDisposalGuideline(){
        return this.disposalGuideline;
    }

    public void setDisposalGuideline(String disposalGuideline){
        this.disposalGuideline = disposalGuideline;
    }

    public void setRecyclingTips(String recyclingTips){
        this.recyclingTips = recyclingTips;
    }

    public String getRecyclingTips(){
        return this.recyclingTips;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (!(o instanceof Waste garbage))
            return false;
        return Objects.equals(this.id, garbage.id) &&
                Objects.equals(this.categoryName, garbage.categoryName) &&
                Objects.equals(this.disposalGuideline, garbage.disposalGuideline) &&
                Objects.equals(this.recyclingTips, garbage.recyclingTips);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.categoryName, this.disposalGuideline, this.recyclingTips);
    }
    @Override
    public String toString(){
        return "Waste Management{" + " id=" + this.id+ ", waste type= "+this.categoryName +
        "how to dispose it= "+ this.disposalGuideline + "how to recycle it= "+ this.recyclingTips + " }";
    }
}
