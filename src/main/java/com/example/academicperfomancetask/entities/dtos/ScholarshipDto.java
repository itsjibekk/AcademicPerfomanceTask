package com.example.academicperfomancetask.entities.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScholarshipDto {

    Long id;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    Date start_date;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    Date end_date;
    double rate;
    Long student_id;
}
