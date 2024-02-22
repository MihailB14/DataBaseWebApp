package com.postgresql.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "my_table")
public class Person {
    @Id
    private long id;
    private String nume;
    private String prenume;
}
