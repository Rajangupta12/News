package com.example.coad.service;

import com.example.coad.entity.NewsEntity;
import com.example.coad.repository.NewRepository;
import com.example.coad.respons.NewsRespons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class NewsService {

    @Autowired
   private RestTemplate restTemplate;

    @Autowired
    private NewRepository repository;


    public NewsRespons getNews(String country, String category, String apiKey){
        String url = "https://newsapi.org/v2/top-headlines?country="+country+"&category="+category+"&apiKey="+apiKey;

        NewsRespons newsRespons = new NewsRespons();

        newsRespons = restTemplate.getForObject(url, NewsRespons.class);
        for(int i = 0; i< Objects.requireNonNull(newsRespons).getArticles().size(); i++){
            NewsEntity newsEntity = new NewsEntity();
            newsEntity.setAuthor(newsRespons.getArticles().get(i).getAuthor());
            newsEntity.setUrl(newsRespons.getArticles().get(i).getUrl());
            newsEntity.setTitle(newsRespons.getArticles().get(i).getTitle());
            repository.save(newsEntity);
        }

        return newsRespons;

    }
}