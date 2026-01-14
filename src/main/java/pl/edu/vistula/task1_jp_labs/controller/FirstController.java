package pl.edu.vistula.task1_jp_labs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {

    @GetMapping(value = "/")
    public String Hello(){
        return "Hello vistula project!";
    }
    @GetMapping(value="/greeting")
    public String Greeting(@RequestParam(name="name", required=false, defaultValue = "World") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
}
