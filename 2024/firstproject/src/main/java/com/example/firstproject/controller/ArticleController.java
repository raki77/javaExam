package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
//import com.example.firstproject.entity.Article;
//import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

//    @Autowired // 미리 생성해 놓은, 객체를 자동 연결
//    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        System.out.println("title: " + form.getTitle());
        System.out.println("content: " + form.getContent());


//        System.out.println(form.title);
//        System.out.println(form.content);

        // 1. dto 변환 entity
//        Article article = form.toEntity();
//        System.out.println(article.toString());

        // 2. repository 에게 entity 를 db안에 저장하게 함.
//        Article saved = articleRepository.save(article);
//        System.out.println(saved.toString());


        return "";
    }
}
