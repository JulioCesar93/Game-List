package com.jcs.gameList.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList List;

    public BelongingPK () {
    }

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.List = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return List;
    }

    public void setList(GameList list) {
        List = list;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BelongingPK that = (BelongingPK) obj;
        return game.equals(that.game) && List.equals(that.List);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, List);
    }
}
