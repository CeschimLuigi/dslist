package com.luigiCeschim.dslist.controllers;

import com.luigiCeschim.dslist.dto.GameMinDTO;
import com.luigiCeschim.dslist.entities.Game;
import com.luigiCeschim.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    public List<GameMinDTO>findAll(){

        return gameService.findAll();
    }

}
