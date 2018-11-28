package com.example.tim.DTO;

import com.example.tim.Model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 28.11.2018.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupDTO {

    @NotEmpty
    private String nameGroup;

    //private List<User> users;

}
