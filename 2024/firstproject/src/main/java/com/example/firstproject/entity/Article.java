package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

//@Entity // DB가 해당 객체를 인식 가능.!!!
@AllArgsConstructor
@ToString
public class Article {
    
//    @Id // 대표값 지정, like 주민번호
//    @GeneratedValue  //1,2,3 자동 생성...  어노테이션
//    private Long id;
//
//    @Column
//    private String title;
//
//    @Column
//    private String content;

//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
