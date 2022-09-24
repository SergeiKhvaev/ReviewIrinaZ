package day35ClassAndObject.song;

public class SongClass {
/*    create a class called Song
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
    String artist;
    char gender;
    int length;

   // public SongClass(String name, String artist, char gender, int length){
      //  this.name = name;
      //  this.artist = artist;
      //  this.gender = gender;
      //  this.length = length;
   // }// constractor


    public SongClass(String name, String artist, char gender, int length) {
        this.name = name;
        this.artist = artist;
        this.gender = gender;
        this.length = length;
    }

    public String toString() {// toString menhod
        return "SongClass{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", gender=" + gender +
                ", length=" + length +
                '}';
    }
}
