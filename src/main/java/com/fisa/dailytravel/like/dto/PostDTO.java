package com.fisa.dailytravel.like.dto;


import lombok.*;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PostDTO {
    private String postTitle;
    private String postContent;
    private String placeName;
    private int likesCount;
    private String thumbnail;
    private Double latitude;
    private Double longitude;
}
