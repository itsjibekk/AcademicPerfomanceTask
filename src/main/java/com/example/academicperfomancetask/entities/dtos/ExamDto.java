package com.example.academicperfomancetask.entities.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExamDto {
    Long id;
    Long subject_id;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    Date exam_date;
    double duration;
}
