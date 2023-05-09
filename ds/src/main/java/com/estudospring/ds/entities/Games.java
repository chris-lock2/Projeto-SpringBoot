package com.estudospring.ds.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_name")
public class Games {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String plataforms;
    private Double score;
    private String imgUrl;
    private String shortDescriptio;
    private String longDescriptio;

    //Construtor Vazio
    public Games(){

    }

    //Construtor
    public Games(Long id, String title, Integer year, String genre, String plataforms, Double score, String imgUrl, String shortDescriptio, String longDescriptio) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.plataforms = plataforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescriptio = shortDescriptio;
        this.longDescriptio = longDescriptio;
    }



    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlataforms() {
        return plataforms;
    }

    public void setPlataforms(String plataforms) {
        this.plataforms = plataforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescriptio() {
        return shortDescriptio;
    }

    public void setShortDescriptio(String shortDescriptio) {
        this.shortDescriptio = shortDescriptio;
    }

    public String getLongDescriptio() {
        return longDescriptio;
    }

    public void setLongDescriptio(String longDescriptio) {
        this.longDescriptio = longDescriptio;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Games games)) return false;
        return Objects.equals(id, games.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
