package com.example.coad.controller;

import com.example.coad.respons.NewsRespons;
import com.example.coad.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url/v1")
public class NewsController {

    @Autowired
    private NewsService newsService;


    @GetMapping("/name")
    public NewsRespons GetName(@RequestParam String country, @RequestParam String category, @RequestParam String apiKey){
        return newsService.getNews(country,category,apiKey);
      }
}
