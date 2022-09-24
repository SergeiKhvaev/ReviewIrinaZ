package day36classandobject.song;

public class SongClass {
/*
 create a class called Song
        - data:
            name, length, artist, genre
        - constructor
            - create a constructor that creates an Song object
with the name, length, artist, and genre
        - method:
            toString()
                print all the Song information
    Create a separate class to create and test the Song objects
 */

    String name;
    double length;
    String artist;
    String genre;


    // we can overload constractor, create 2,3,4... constructors
    public SongClass(String name, double length, String artist, String genre){
        this.name = name;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }

    public SongClass(String name, double length){
        this.name = name;
        this.length = length;

    }


    public String toString() {
        return "SongClass{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", gender='" + genre + '\'' +
                '}';
    }
}
