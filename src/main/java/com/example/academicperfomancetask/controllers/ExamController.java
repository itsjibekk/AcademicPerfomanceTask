package com.example.academicperfomancetask.controllers;

import com.example.academicperfomancetask.entities.dtos.ExamDto;
import com.example.academicperfomancetask.services.ExamService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExamService examService;

    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    @PostMapping("/save")
    public ExamDto save(@RequestBody ExamDto examDto){
        return examService.save(examDto);
    }
    @PostMapping("/update")
    public ExamDto update(@RequestBody ExamDto examDto){
        return examService.update(examDto);
    }
}
