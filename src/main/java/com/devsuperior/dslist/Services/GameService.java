package com.devsuperior.dslist.Services;

import com.devsuperior.dslist.com.devsuperior.dslist.entities.Game;
import dto.GamingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist.repositories.GameRepository;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GamingDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GamingDTO(x)).toList();
    }

}
