package com.juliocesar.crud.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "tbl_student")

public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Long studentId;
    private String name;
    private  String lastName;
    @Column(name = "email_address", unique = true, nullable = false)
    private String email;

}
