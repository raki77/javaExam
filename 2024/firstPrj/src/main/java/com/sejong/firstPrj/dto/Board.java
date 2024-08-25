package com.sejong.firstPrj.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
    private long id;
    private String name;
    private int age;
    private String grade;
    private String job;
    private long point;
}