package com.enviro.assessment.grad001.mphorakgope.repository;

import com.enviro.assessment.grad001.mphorakgope.model.Waste;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface WasteRepository extends JpaRepository<Waste, Long> {

}
