package com.jcs.gameList.repositories;

import com.jcs.gameList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/*Componente da camada de acesso/consulta no BD, seja para inserir, deletar, alterar, etc*/
public interface GameRepository extends JpaRepository<Game, Long> {

}
