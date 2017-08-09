package me.moosecanswim.springbook06.Controller;

import me.moosecanswim.springbook06.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("Song", new Song());
        return "songform";
    }
    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song){
        return "confirmsong";
    }
}
