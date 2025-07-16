package com.supplementstore.supplementstore.controller;

import com.supplementstore.supplementstore.entites.Users;
import com.supplementstore.supplementstore.service.loginservice;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class logincontroller {

    @Autowired
    private loginservice logservice;

    @RequestMapping("/login")
    public String showlog() {
        return "login"; // shows login.jsp
    }

    @PostMapping("/authUserByData")
    public String authUserByData(@RequestParam("username") String username,
                                 @RequestParam("password") String password,
                                 HttpSession session,
                                 Model model) {

        Users loguser = logservice.authUserByData(username, password);
        
        if (loguser != null) {
            session.setAttribute("firstname", loguser.getFirstname()); // ✅ store firstname in session
            return "redirect:/dashboard"; // ✅ redirect to dashboard controller
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}

