package com.jcs.gameList.services;

import com.jcs.gameList.dto.GameListDTO;
import com.jcs.gameList.entities.GameList;
import com.jcs.gameList.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired /* Annotation para injetar o "gameRepository" na Camada de Serviços*/
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}


