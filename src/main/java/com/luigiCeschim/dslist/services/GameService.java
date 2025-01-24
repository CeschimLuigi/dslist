package com.luigiCeschim.dslist.services;

import com.luigiCeschim.dslist.dto.GameDTO;
import com.luigiCeschim.dslist.dto.GameMinDTO;
import com.luigiCeschim.dslist.projections.GameMinProjection;
import com.luigiCeschim.dslist.repositories.GameRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;



    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        var result = gameRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO>findAll(){
       var result = gameRepository.findAll();

       return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO>findByList(Long listId){
        var result = gameRepository.searchByList(listId);

        return result.stream().map(GameMinDTO::new).toList();
    }



}
