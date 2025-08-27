package dto;

import com.devsuperior.dslist.com.devsuperior.dslist.entities.GameList;

public class GameListDTO {
    private long id;
    private String name;

    public GameListDTO(){
    }

    public GameListDTO(GameList entity) {
       id = entity.getId();
       name = entity.getName();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
