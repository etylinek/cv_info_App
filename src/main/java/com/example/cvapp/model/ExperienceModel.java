package com.example.cvapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class ExperienceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String company;
    @Column
    private String workplace;
    @Column
    private String description;
    @Column
    private Date dateFrom;
    @Column
    private Date dateTo;

}
