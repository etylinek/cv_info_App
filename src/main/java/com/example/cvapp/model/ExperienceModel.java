package com.example.cvapp.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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

 //   @Column
    private String company;

  //  @Column
    private String position;

 //   @Column
    private String description;

 //   @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateStart;

 //   @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEnd;

}
