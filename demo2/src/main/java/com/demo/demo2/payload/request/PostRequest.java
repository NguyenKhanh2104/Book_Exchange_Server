package com.demo.demo2.payload.request;

import lombok.Data;

import java.util.Date;
@Data
public class PostRequest {
    Integer id;
    String username;
    String content;
    String img;
    String bookName;
    String category;
    Boolean status;
    String description;
    Date date;
}
