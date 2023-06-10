package com.jcs.gameList.controllers;

import com.jcs.gameList.dto.GameListDTO;
import com.jcs.gameList.dto.GameMinDTO;
import com.jcs.gameList.dto.ReplacementDTO;
import com.jcs.gameList.services.GameListService;
import com.jcs.gameList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/lists")
public class GameListController {

    @Autowired /*Injetado Service na camada Controllers*/
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{ListId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long ListId) {
        List<GameMinDTO> result = gameService.findByList(ListId);
        return result;
    }

    @PostMapping(value = "/{ListId}/replacement")
    public void move(@PathVariable Long ListId, @RequestBody ReplacementDTO body) {
        gameListService.move(ListId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
