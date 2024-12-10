package com.kyodev.dslist.repositories;

import com.kyodev.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepositry extends JpaRepository<Game, Long> {

}
