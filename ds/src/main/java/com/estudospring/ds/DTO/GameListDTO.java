package com.estudospring.ds.DTO;

import com.estudospring.ds.entities.GameList;

public class GameListDTO {
    //Atributos
    private Long id;
    private String name;

    //Construtor vazio
    public GameListDTO(){

    }

    //Construtor
    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

    //Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
