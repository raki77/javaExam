package com.sejong.firstPrj.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
    public String id;
    public String name;
    public int age;
    public String grade;
    public String job;
    public long point;
}