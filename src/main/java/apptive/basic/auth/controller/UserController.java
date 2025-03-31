package apptive.basic.auth.controller;

import apptive.basic.auth.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/")
    public String loginHome(Model model){
        model.addAttribute("user", new User());
        return "users/home";
    }
}
