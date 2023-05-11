package com.estudospring.ds.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

//Classe auxiliar
@Embeddable
public class BelongingPK {
    //Atributos
    @ManyToOne
    @JoinColumn(name = "game_id")
    private  Games game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    //Contrutor vazio
    public BelongingPK(){

    }

    //Construtor
    public BelongingPK(Games game, GameList list) {
        this.game = game;
        this.list = list;
    }

    //Getters and Setters
    public Games getGame() {
        return game;
    }

    public void setGame(Games game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    //Generation equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelongingPK that)) return false;
        return Objects.equals(game, that.game) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
