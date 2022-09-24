package day40methodovverriding.app;

import day39inharitance_encapsulation.app.YouTube;

public class Running {
    public static void main(String[] args) {
        YouTubeApp youtube = new YouTubeApp(4.8);
        System.out.println(youtube.name);
        System.out.println(youtube.version);
        youtube.download();
        youtube.watchVideo();
        System.out.println(youtube);


    }
}
