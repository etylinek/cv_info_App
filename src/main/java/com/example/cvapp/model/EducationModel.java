package com.example.cvapp.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class EducationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "academic")
    private String academic;
    @Column(name = "academic_title")
    private String academicTitle;
    @Column(name = "specialization")
    private String specialization;
    @Column(name = "score")
    private Float score;

    @Column(name = "date_start")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateStart;

    @Column(name = "date_end")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEnd;



}
