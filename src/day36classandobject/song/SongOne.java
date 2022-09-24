package day36classandobject.song;

public class SongOne {
    public static void main(String[] args) {
        SongClass songOne = new SongClass("Disel power", 4.5, "Prodigy", "Male"); // we called constructor with 4 arguments

        System.out.println(songOne);

        SongClass songTwo = new SongClass("Abba", 4.12); // we called constructor with 2 arguments
        System.out.println(songTwo);


    }


}

