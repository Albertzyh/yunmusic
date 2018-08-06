package com.qingguatang.java5minute.course7;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MusicControl {

    private static final Map<String,String> musics = new HashMap<>();

    @RequestMapping(value = "/song/music")
    @ResponseBody
    public String getMusicSrc(String songId){
        return musics.get(songId);}

    @PostConstruct
    public void init(){
        musics.put("35847388",
                "http://m10.music.126.net/20180803213957/6543720687121ede803f8a512c812f10/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3");

        musics.put("2117009",
                "http://m10.music.126.net/20180806204716/b80585efff1b795218a8a36aa88ead63/ymusic/56e1/ec67/c249/c07799185b858908bd85268507f44b1e.mp3");
    }
}
