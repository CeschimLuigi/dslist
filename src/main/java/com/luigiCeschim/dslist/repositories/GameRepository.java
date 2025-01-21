package com.luigiCeschim.dslist.repositories;

import com.luigiCeschim.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
