package com.luigiCeschim.dslist.dto;

import com.luigiCeschim.dslist.entities.Game;
import com.luigiCeschim.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){

    }

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
