package com.sejong.firstPrj.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
    private Integer image_id;
    private String image_name;
    private String file_path;
    private Timestamp uploaded_at;

    @Override
    public String toString() {
        return "Board{" +
                "image_id=" + image_id +
                ", image_name='" + image_name + '\'' +
                ", file_path='" + file_path + '\'' +
                ", uploaded_at=" + uploaded_at +
                '}';
    }
}