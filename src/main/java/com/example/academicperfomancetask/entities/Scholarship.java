package com.example.academicperfomancetask.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Scholarship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    double rate;
    Date start_date;
    Date end_date;
    @ManyToOne
    Student student;
}
