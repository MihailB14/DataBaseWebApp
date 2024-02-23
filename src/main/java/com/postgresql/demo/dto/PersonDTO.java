package com.postgresql.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonDTO {
    Integer id;
    String nume;
    String prenume;
}
