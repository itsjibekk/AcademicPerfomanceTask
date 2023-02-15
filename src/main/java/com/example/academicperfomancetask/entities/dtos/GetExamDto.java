package com.example.academicperfomancetask.entities.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetExamDto {

    @JsonProperty("date")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    Date date;
    @JsonProperty("score")
    int score;
    Long examId;
}
