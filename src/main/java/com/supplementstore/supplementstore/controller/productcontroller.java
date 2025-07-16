package com.supplementstore.supplementstore.controller;

import com.supplementstore.supplementstore.entites.Products;
import com.supplementstore.supplementstore.service.productservice;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class productcontroller {

    @Autowired
    private productservice productService;

    @GetMapping("/dashboard")
    public String showDashboard(Model model, HttpSession session) {

        // ✅ Fetch Firstname from session
        String firstname = (String) session.getAttribute("firstname");
        model.addAttribute("firstname", firstname);

        // ✅ Fetch products from database
        List<Products> productList = productService.getAllItems();
        if (!productList.isEmpty()) {
            model.addAttribute("product", productList.get(0));
        }

        return "dashboard"; // shows dashboard.jsp
    }
}
