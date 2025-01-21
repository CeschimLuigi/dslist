package com.luigiCeschim.dslist.services;

import com.luigiCeschim.dslist.dto.GameMinDTO;
import com.luigiCeschim.dslist.entities.Game;
import com.luigiCeschim.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO>findAll(){
       var result = gameRepository.findAll();

       return result.stream().map(GameMinDTO::new).toList();
    }
}
