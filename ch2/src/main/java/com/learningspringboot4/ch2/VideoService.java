package com.learningspringboot4.ch2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

record Video(String name){}

@Service
public class VideoService {

    List<Video> videos= List.of(
            new Video("Need help with your spring boot 2 app"),
            new Video("Dont do this to your own code"),
            new Video("SERCRETS to fix broken code!")
    );

    public List<Video> getVideos(){
        return videos;
    }

    public Video create(Video newVideo){
        List<Video> extend=new ArrayList<>(videos);
        extend.add(newVideo);
        this.videos=List.copyOf(extend);
        return newVideo;
    }

}
