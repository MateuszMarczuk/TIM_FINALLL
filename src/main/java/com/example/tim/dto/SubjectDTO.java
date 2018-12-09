package com.example.tim.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 09.12.2018.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDTO {

    @NotEmpty
    private String name;

    @NotEmpty
    private String typeOfActivities;
}
