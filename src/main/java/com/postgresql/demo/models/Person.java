package com.postgresql.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "my_table")
public class Person {
    @Id
    private int id;
    private String nume;
    private String prenume;

    public Person(long id, String nume, String prenume) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
    }

    public int getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

}
