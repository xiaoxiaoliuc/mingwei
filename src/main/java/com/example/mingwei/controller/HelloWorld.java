package com.example.mingwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * 老哥写点注释吧
 *
 * @Create By liuc QQ 2379817864
 * @Date 2019/6/13 17:59
 * @see
 */
@Controller
public class HelloWorld {

    @GetMapping("about.html")
    public String about(Model model){
        return "about";
    }
    @GetMapping("account.html")
    public String account1(Model model){
        return "account";
    }
    @GetMapping("advance-analytics.html")
    public String advance2(Model model){
        return "advance-analytics";
    }
    @GetMapping("blog.html")
    public String blog3(Model model){
        return "blog";
    }
    @GetMapping("blog-sidebar.html")
    public String blog4(Model model){
        return "blog-sidebar";
    }
    @GetMapping("blog-single.html")
    public String blog5(Model model){
        return "blog-single";
    }
    @GetMapping("checkout.html")
    public String checkout6(Model model){
        return "checkout";
    }
    @GetMapping("clients.html")
    public String clients7(Model model){
        return "clients";
    }
    @GetMapping("contact.html")
    public String contact98(Model model){
        return "contact9";
    }
    @GetMapping("corporate-finance.html")
    public String corporate10(Model model){
        return "corporate-finance";
    }
    @GetMapping("customer-marketing.html")
    public String customer11(Model model){
        return "customer-marketing";
    }
    @GetMapping("faq.html")
    public String faq(Model model){
        return "faq";
    }
    @GetMapping("HelloWorld.html")
    public String HelloWorld(Model model){
        return "HelloWorld";
    }
    @GetMapping("")
    public String index(Model model){
        return "index";
    }
    @GetMapping("index-2.html")
    public String index2(Model model){
        return "index-2";
    }
    @GetMapping("index-3.html")
    public String index3(Model model){
        return "index-3";
    }
    @GetMapping("index-4.html")
    public String index4(Model model){
        return "index-4";
    }
    @GetMapping("information-technology.html")
    public String information(Model model){
        return "information-technology";
    }
    @GetMapping("not-found.html")
    public String not(Model model){
        return "not-found";
    }
    @GetMapping("price.html")
    public String price(Model model){
        return "price";
    }
    @GetMapping("private-equity.html")
    public String equity(Model model){
        return "private-equity";
    }
    @GetMapping("project-3-column.html")
    public String column(Model model){
        return "project-3-column";
    }
    @GetMapping("project-4-column.html")
    public String projectcolumn(Model model){
        return "project-4-column";
    }
    @GetMapping("project-masonry.html")
    public String projectmasonry(Model model){
        return "project-masonry";
    }
    @GetMapping("project-masonry-2.html")
    public String masonry(Model model){
        return "masonry-2";
    }
    @GetMapping("project-single.html")
    public String project(Model model){
        return "project-single";
    }
    @GetMapping("projects.html")
    public String projects(Model model){
        return "projects";
    }
    @GetMapping("services.html")
    public String services(Model model){
        return "services";
    }
    @GetMapping("shop-single.html")
    public String shop(Model model){
        return "shop-single";
    }
    @GetMapping("shoping-cart.html")
    public String shoping(Model model){
        return "shoping-cart";
    }
    @GetMapping("shops.html")
    public String shops(Model model){
        return "shops";
    }
    @GetMapping("social-marketing.html")
    public String social(Model model){
        return "social-marketing";
    }
    @GetMapping("testimonial.html")
    public String testimonial(Model model){
        return "testimonial";
    }
}

