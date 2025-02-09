package com.luigiCeschim.dslist.controllers;

import com.luigiCeschim.dslist.dto.GameListDTO;
import com.luigiCeschim.dslist.dto.GameMinDTO;
import com.luigiCeschim.dslist.dto.ReplacementDTO;
import com.luigiCeschim.dslist.services.GameListService;
import com.luigiCeschim.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping()
    public List<GameListDTO>findAll(){

        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO>findByList(@PathVariable Long listId){

        return gameService.findByList(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    void move(@PathVariable Long listId,@RequestBody ReplacementDTO replacementDTO){

        gameListService.move(listId, replacementDTO.getSourceIndex(),replacementDTO.getDestinationIndex());
    }
}
