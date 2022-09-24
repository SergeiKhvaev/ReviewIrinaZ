package day39inharitance_encapsulation.app;

public class ListOffavoritApps {
    public static void main(String[] args) {
        // object from Super Class
       App appExampl = new App("JavaCompiler", 2.0);
        appExampl.download();
        System.out.println(appExampl.name);
        System.out.println(appExampl.version);
        System.out.println(appExampl);

        System.out.println("=======================");

        Instagram instagram = new Instagram("Instagram", 1.2, "with massenger");
        instagram.download();// called method from Parent class
        System.out.println(instagram.name);
        System.out.println(instagram.version);
        System.out.println(instagram.withMessanger);
        instagram.postPictures();// called method from Child class
        System.out.println(instagram);


        System.out.println("==========================");
        YouTube youtube = new YouTube("With news", "YouTube", 4.5);
        youtube.download();// called method from Parent class
        System.out.println(youtube.name);
        System.out.println(youtube.version);
       System.out.println(youtube.withNews);
        youtube.watchVideo();// called own method from child class
        System.out.println(youtube);




    }
}