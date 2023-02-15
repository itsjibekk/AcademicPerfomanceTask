package com.example.academicperfomancetask.controllers;

import com.example.academicperfomancetask.entities.dtos.GetStudentDto;
import com.example.academicperfomancetask.entities.dtos.StudentDto;
import com.example.academicperfomancetask.services.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public StudentDto save(@RequestBody StudentDto studentDto){
        return studentService.save(studentDto);
    }

    @PostMapping("/update")
    public StudentDto update(@RequestBody StudentDto studentDto){
        return studentService.update(studentDto);
    }



}
