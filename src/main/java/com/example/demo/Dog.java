package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Min(1)
    private long id;

    @NotNull
    @Size(min = 1)
    private String name;

    @NotNull
    private String age;

}
