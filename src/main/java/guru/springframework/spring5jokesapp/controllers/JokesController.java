package guru.springframework.spring5jokesapp.controllers;


import guru.springframework.spring5jokesapp.services.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final ChuckNorrisJokeService chuckNorrisJokeService;

    public JokesController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", chuckNorrisJokeService.getRandomJoke());
        return "index";
    }
}
