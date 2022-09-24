package day33CollectionsMethodsLimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchParts {
    /*
    Switch Pairs
Given an ArrayList of words switch position for
each pair in the List. A pair is an element and the element next to it.
The given ArrayList will always have an even number
of elements so each element will always have a single pair.
Ex:
Input: {"Cat", "in", "the", "hat"}
There is two pairs:
"Cat" and "in"
 "the" and "hat"

Output: {"in", "Cat", "hat", "theФ}
     */
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat" ));
        System.out.println(list);
        System.out.println(switchElements(list));

    }

    public static ArrayList<String> switchElements (ArrayList<String> list){ // не нужно создавать новый лис, делаем все изменени€ в данном листе.. мы также можем использовать collections method swap
        for(int i = 0 ; i <list.size() ; i += 2){ // это шаг итерации, который позвол€ет итерировать не +1, но +2, т.е цикл парами
           // System.out.println("pairs " + list.get(i) + " | " + list.get(i+1)); - how we take pairs, эта логика внутри итерации, следующа€ итераци€ +2 индекса, т.е. не следующий элемент, а следующа€ пара элементов
            String temporary = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, temporary);

        }
        return list;
    }

}
