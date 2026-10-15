package com.learningspringboot4.ch2;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange("/api/videos")
public interface VideoClient {

    @GetExchange(version = "1")
    List<Video> getVideos();
}
