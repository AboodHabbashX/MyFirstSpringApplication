package com.Abood.TestingSpring.user;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(name = "student-id-sequence",
            sequenceName = "student-id-sequence"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "student-id-sequence"
    )
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;

}
