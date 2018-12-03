package com.example.tim.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 28.11.2018.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupDTO {

    @NotEmpty
    private String name;

    //private List<User> users;

}
