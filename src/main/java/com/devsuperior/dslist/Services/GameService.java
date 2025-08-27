package com.devsuperior.dslist.Services;

import com.devsuperior.dslist.com.devsuperior.dslist.entities.Game;
import dto.GameDto;
import dto.GamingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDto findById(long id){
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
    }
    @Transactional(readOnly = true)
    public List<GamingDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GamingDTO(x)).toList();
    }

}
