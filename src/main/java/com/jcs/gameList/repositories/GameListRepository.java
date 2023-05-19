package com.jcs.gameList.repositories;

import com.jcs.gameList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

/*Componente da camada de acesso/consulta no BD, seja para inserir, deletar, alterar, etc*/
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
