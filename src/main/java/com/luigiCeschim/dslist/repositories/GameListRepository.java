package com.luigiCeschim.dslist.repositories;

import com.luigiCeschim.dslist.entities.Game;
import com.luigiCeschim.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
