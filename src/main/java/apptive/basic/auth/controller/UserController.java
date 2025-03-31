package apptive.basic.auth.controller;

import apptive.basic.auth.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/")
    public String loginHome(Model model){
        model.addAttribute("user", new User());
        return "/home";
    }

    @GetMapping("/signup")
    public String signupForm(Model model){
        model.addAttribute("user", new User());
        return "/signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute User user, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        //검증 구현 필요

        log.info("user = {}", user);


        //성공 로직

        return "redirect:/users/home";
    }

    @GetMapping("/login")
    public String loginForm(Model model){
        model.addAttribute(new User());

        return "/login";
    }

    @PostMapping("login")
    public String login(@ModelAttribute User user, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        // 검증 로직

        return "redirect:/main";
    }
}
