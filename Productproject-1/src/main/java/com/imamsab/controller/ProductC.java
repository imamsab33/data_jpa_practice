package com.imamsab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.imamsab.entity.ProductE;
import com.imamsab.service.ProductS;

@Controller

public class ProductC {

    @Autowired
    private ProductS produ;

    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products", produ.getAllProducts());
        return "/list";
    }

    @GetMapping("/new")
    public String showProductForm(Model model) {
        model.addAttribute("product", new ProductE());
        return "/form";
    }

    @PostMapping("/new")
    public String saveProduct(@ModelAttribute("product") ProductE product) {
        produ.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("product", produ.getProductById(id).orElse(null));
        return "/form";
    }

    @PostMapping("/edit/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute("product") ProductE product) {
        produ.saveProduct(product);
        return "redirect:/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        produ.deleteProduct(id);
        return "redirect:/form";
    }
}
