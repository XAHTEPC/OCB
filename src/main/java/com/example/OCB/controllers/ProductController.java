package com.example.OCB.controllers;

import com.example.OCB.models.Auth;
import com.example.OCB.models.Product;
import com.example.OCB.services.Conrol;
import com.example.OCB.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/")
    public String start(){
        return "pass";
    }

    @GetMapping("/product")
    public String products(Model model) {
        model.addAttribute("products", productService.listProducts());
        return "products";
    }
    @PostMapping("/login")
    public String login(Auth auth){
        System.out.println(auth.getLogin());
        System.out.println(auth.getPass());
        boolean fl = Conrol.check(auth.getPass(),auth.getLogin());
        if(fl)
            return "redirect:/product";
        else
            return "redirect:/";
    }


    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }
    @PostMapping("/product/create")
    public String createProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/product";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/product";
    }
}
