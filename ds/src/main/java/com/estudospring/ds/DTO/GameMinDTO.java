package com.estudospring.ds.DTO;

import com.estudospring.ds.entities.Games;

public class GameMinDTO {
    //Atributos
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    //Construtor Vazio
    public GameMinDTO(){

    }

    //Construtor
    public GameMinDTO(Games entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
