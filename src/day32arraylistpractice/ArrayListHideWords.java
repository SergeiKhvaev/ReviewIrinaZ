package day32arraylistpractice;

import javax.sound.midi.Soundbank;
import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListHideWords {
    public static void main(String[] args) {
        /*
Hide passwords
Given an ArrayList of passwords (String). Hide each
 password in a star (*) format where each character
is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}

Output:
[ ***, **, **** ]
         */

        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
            ArrayList<String> hiddenWords = new ArrayList<>();

           for(String eachElement : words){
               hiddenWords.add("*".repeat(eachElement.length()));
            }
        System.out.println(hiddenWords);

        System.out.println("=========================================");
           // another solvation

        ArrayList<String> words2 = new ArrayList<>(Arrays.asList("Sergei", "Ekaterina", "Eva"));
        ArrayList<String> hiddenWords2 = new ArrayList<>();

        for(String eachWord : words2){
            String stars ="";
            for(int i = 0; i < eachWord.length() ; i++){
                stars += '*';

            }
            hiddenWords2.add(stars);
        }
        System.out.println(words2);
        System.out.println(hiddenWords2);



        }





    }

