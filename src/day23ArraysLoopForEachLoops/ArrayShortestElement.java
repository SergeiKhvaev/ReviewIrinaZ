package day23ArraysLoopForEachLoops;

public class ArrayShortestElement {
    public static void main(String[] args) {


        String [] array = {"Sergei", "Ekaterina", "Eva", "Anatolihhhhy"};


String longest = array[0];

for (int i = 0; i < array.length ; i++){
    if (array[i].length() > longest.length()){
        longest = array[i];
    }
}
        System.out.println("longest " + longest);

    }

}
