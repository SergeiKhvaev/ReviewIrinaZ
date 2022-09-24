package day34ClassAndObjectsIntro.app;

import javax.sound.midi.Soundbank;

public class App {
    String name;
    double version;
    boolean isFree;
    int rating;

    public void update(){
        System.out.println(name + " is updated");
        version += 0.1;

    }

    public String toString(){ // метод который дает нам воможность распечатать полностью весь обхект с созданными переменными (кружочек со стрелкой появляется, если синтакиси метода верен)
        return "Name: " + name + "\nVersion : "+ version+"\nisFree: " + isFree +"\nRating :" + rating;
    } // этот метод встроен, и мы его можем создать в class to define how we to see how our object when we print it by this method
}
