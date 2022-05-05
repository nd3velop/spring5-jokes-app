package guru.springframework.spring5jokesapp.controllers;


import guru.springframework.spring5jokesapp.services.ChuckNorrisJokeService;
import guru.springframework.spring5jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "index";
    }
}
