package com.winterhold.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Author")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Title")
    private String title;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "BirthDate")
    private LocalDate birthDate;

    @Column(name = "DeceasedDate")
    private LocalDate deceasedDate;

    @Column(name = "Education")
    private String education;

    @Column(name = "Summary")
    private String summary;

}
