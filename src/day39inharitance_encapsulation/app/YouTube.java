package day39inharitance_encapsulation.app;

public class YouTube extends App{
    /*
    Create a class Youtube
    - Youtube class inherits App class
    - create constructor to call parent constructor and set up variables (name and version)
    - create method:
        watchVideo()
            Example output: prints Watching java tutorial
     */

    String withNews;

    public YouTube(String withNews, String name, double version){
        super(name, version);
        this.withNews = withNews;

        }
        public void watchVideo(){
            System.out.println("Watch java tutorial on " + name + " " + version);
    }

    public String toString() {
        return "YouTube{" +
                "withNews= " + withNews + '\'' +
                ", name='" + name + '\'' +
                ", version = " + version +
                '}';
    }
}
