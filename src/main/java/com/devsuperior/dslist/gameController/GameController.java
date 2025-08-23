package com.devsuperior.dslist.gameController;

import com.devsuperior.dslist.Services.GameService;
import dto.GamingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GamingDTO> findAll(){
        return gameService.findAll();
    }

}
