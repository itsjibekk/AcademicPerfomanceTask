package com.example.academicperfomancetask.controllers;

import com.example.academicperfomancetask.entities.dtos.SubjectDto;
import com.example.academicperfomancetask.services.SubjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    private final SubjectService subjectService;
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }
    @PostMapping("/save")
    public SubjectDto save(@RequestBody SubjectDto subjectDto){
        return subjectService.save(subjectDto);
    }

    @PostMapping("/update")
    public SubjectDto update(@RequestBody SubjectDto subjectDto){
        return subjectService.update(subjectDto);
    }

}
