package com.learningspringboot4.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@RestController
public class ApiController {

    private final VideoService videoService;

    public ApiController(VideoService videoService){
        this.videoService=videoService;
    }

    @GetMapping("/api/video")
    public List<Video> all(){
        return videoService.getVideos();
    }

    @PostMapping("/api/video")
    public Video newVideo(@RequestBody Video newVideo){
        return videoService.create(newVideo);
    }

    @GetMapping("/react")
    public String react(){
        return "react";
    }

    @GetMapping(value = "/api/{version}/videos",version = "1")
    public List<Video> allV1(){
        return videoService.getVideos();
    }
}
