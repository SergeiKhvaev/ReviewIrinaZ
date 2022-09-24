package day31arraylist;

import java.util.ArrayList;

public class ArrayListCharacter {
    public static void main(String[] args) {
        ArrayList<Character> name = new ArrayList<>();
        name.add('S');
        name.add('e');
        name.add('r');
        name.add('g');
        name.add('e');
        name.add('i');
        System.out.println(name);
        System.out.println("===================================================");
        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println((name.get(2)));
        System.out.println(name.get(name.indexOf('g')));
        System.out.println(name.get(name.indexOf('e')));
        System.out.println(name.get(name.indexOf('i')));
        System.out.println("===================================================");

        for(Character each : name){
            System.out.println(each);
            }
        System.out.println();

        for(int i = 0 ; i < name.size() ; i++){
            System.out.println(name.get(i));
        }
    }
}
