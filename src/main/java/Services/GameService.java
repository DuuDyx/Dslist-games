package Services;

import com.devsuperior.dslist.entities.Game;
import dto.GameminDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.GameRepository;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameminDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameminDTO> dto = result.stream().map(x -> new GameminDTO(x)).toList();
        return dto;
    }

}
