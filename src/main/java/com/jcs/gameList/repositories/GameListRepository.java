package com.jcs.gameList.repositories;

import com.jcs.gameList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/*Componente da camada de acesso/consulta no BD, seja para inserir, deletar, alterar, etc*/
public interface GameListRepository extends JpaRepository<GameList, Long> {

    @Modifying
    @Query(nativeQuery = true,
            value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
