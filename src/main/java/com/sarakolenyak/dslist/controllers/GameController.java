package com.sarakolenyak.dslist.controllers;

import com.sarakolenyak.dslist.dto.GameMinDTO;
import com.sarakolenyak.dslist.entities.Game;
import com.sarakolenyak.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
