package com.jcs.gameList.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @jakarta.persistence.Id /*Chave Primária*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*Geração e identificação do Id no BD*/
    private Long Id;
    private String name;

    public GameList() {

    }

    public GameList(Long id, String name) {
        this.Id = id;
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GameList gameList = (GameList) obj;
        return Id.equals(gameList.Id) && Objects.equals(name, gameList.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name);
    }
}
