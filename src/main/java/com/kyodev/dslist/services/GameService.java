package com.kyodev.dslist.services;

import com.kyodev.dslist.dto.GameMinDTO;
import com.kyodev.dslist.entities.Game;
import com.kyodev.dslist.repositories.GameRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepositry gameRepositry;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepositry.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
