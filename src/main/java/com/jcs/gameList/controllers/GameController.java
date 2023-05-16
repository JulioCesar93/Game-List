package com.jcs.gameList.controllers;

import com.jcs.gameList.dto.GameMinDTO;
import com.jcs.gameList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/games")
public class GameController {

    @Autowired /*Injetado Service na camada Controllers*/
    private GameService gameService;

    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
