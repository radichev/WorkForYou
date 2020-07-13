package com.radichev.workforyou.api;

import com.radichev.workforyou.model.bindingModels.educationBindingModel.EducationBindingModel;
import com.radichev.workforyou.service.EducationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/educations")
@CrossOrigin(origins = "http://localhost:4200")
public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @PostMapping("/add/{userId}")
    public ResponseEntity<Void> addEducations(@PathVariable String userId, @Valid @RequestBody EducationBindingModel educationBindingModel){
        this.educationService.addEducation(educationBindingModel, userId);
        return ResponseEntity.ok().build();
    }
}