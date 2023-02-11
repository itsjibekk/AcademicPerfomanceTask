package com.example.academicperfomancetask.controllers;

import com.example.academicperfomancetask.entities.dtos.TeacherDto;
import com.example.academicperfomancetask.services.TeacherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PutMapping("/save")
    public TeacherDto save(@RequestBody TeacherDto teacherDto){
        return teacherService.save(teacherDto);
    }

    @PutMapping("/update")
    public TeacherDto update(@RequestBody TeacherDto teacherDto){
        return teacherService.update(teacherDto);
    }

}
