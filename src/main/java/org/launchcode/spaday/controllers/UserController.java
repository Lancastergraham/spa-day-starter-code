package org.launchcode.spaday.controllers;


import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String userHello(Model model) {
        model.addAttribute("title", "Welcome to User Index");
        return "user/index";
    }

    //Create Handler method to render the form
    @GetMapping("add")
    public String displayAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("title", "Add a user");
        model.addAttribute(new User());

        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm() {

    }

}
