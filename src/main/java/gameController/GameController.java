package gameController;

import Services.GameService;
import com.devsuperior.dslist.entities.Game;
import dto.GameminDTO;
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
    public List<GameminDTO> findAll(){
        List<GameminDTO> result = gameService.findAll();
        return result;
    }

}
