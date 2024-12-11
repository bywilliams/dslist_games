package com.kyodev.dslist.services;

import com.kyodev.dslist.dto.GameDTO;
import com.kyodev.dslist.dto.GameMinDTO;
import com.kyodev.dslist.entities.Game;
import com.kyodev.dslist.repositories.GameRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepositry gameRepositry;

    @Transactional(readOnly = true)
    public GameDTO findByID(Long id) {
        Game result = gameRepositry.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepositry.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
