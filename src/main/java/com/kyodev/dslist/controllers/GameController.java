package com.kyodev.dslist.controllers;

import com.kyodev.dslist.dto.GameDTO;
import com.kyodev.dslist.dto.GameMinDTO;
import com.kyodev.dslist.entities.Game;
import com.kyodev.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findByID(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

}
