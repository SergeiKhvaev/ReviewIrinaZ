package day39inharitance_encapsulation.app;

public class Instagram extends App{
    /*
    Create a class Instagram
    - Instagram class inherits App class
    - create constructor to call parent constructor and set up variables (name and version)
    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram
     */

    String withMessanger;

    public Instagram(String name, double version, String withMessanger){
        super(name, version);
        this.withMessanger = withMessanger;
    }

    public void postPictures(){
        System.out.println("Posting pictures to " + name);
    }

    public String toString() {
        return "Instagram{" +
                "withMessanger='" + withMessanger + '\'' +
                ", name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}



