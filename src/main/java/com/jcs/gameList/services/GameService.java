package com.jcs.gameList.services;

import com.jcs.gameList.dto.GameMinDTO;
import com.jcs.gameList.entities.Game;
import com.jcs.gameList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired /* Annotation para injetar o "gameRepository" na Camada de Serviços*/
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}


