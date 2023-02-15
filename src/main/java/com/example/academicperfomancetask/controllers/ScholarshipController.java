package com.example.academicperfomancetask.controllers;

import com.example.academicperfomancetask.entities.dtos.ScholarshipDto;
import com.example.academicperfomancetask.services.ScholarshipService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scholarship")
public class ScholarshipController {
    private final ScholarshipService scholarshipService;

    public ScholarshipController(ScholarshipService scholarshipService) {
        this.scholarshipService = scholarshipService;
    }

    @PutMapping("/save")
    public ScholarshipDto save(@RequestBody ScholarshipDto scholarshipDto){
       return scholarshipService.save(scholarshipDto);
   }
   @PutMapping("/update")
    public ScholarshipDto update(@RequestBody ScholarshipDto scholarshipDto){
        return scholarshipService.update(scholarshipDto);
   }

}
