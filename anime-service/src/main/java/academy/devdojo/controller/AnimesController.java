package academy.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimesController {

    @GetMapping("/vi/animes")
    public List<String> listAll() {
        return List.of("Naruto", "One Piece", "Dragon Ball Z");
    }
}
