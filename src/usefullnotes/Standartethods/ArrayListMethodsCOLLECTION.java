package usefullnotes.Standartethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsCOLLECTION {
    public static void main(String[] args) {

        /*
        Those methods located in java.util.ArrayList class
        1. if we want print whole ArrayList we can use regular print statment System.out.println(name of ArrayList); //

        2. name.size() определяет размер arraylist, return numbers of elements of ArrayList (аналог length for arrays or length() for Strings;

        3. name.add(element)// add giving element to the end of list(that how usually elements ordered in list, by inserting order.

        3.1.  name.add(index, element) add giving element on position of giving index. All others elements shift over their positions

        4. name.get(index) - arraylist has own method to read element from list by indexes. Return element of given index, return element

        5. name.remove(element) - remove given element from ArrayList. Return boolean. True if removed element successful, false if there is no element in list that need to be removed. Boolean result we can use in future code

        5.1 name.remove(index) - remove element in position of given index. Return removed element if we want to use removed element in future

        6. name. ismpty() - checks if there are any elements in ArrayList, return boolean. True if there are element, false if not

        7.name. clear() - make ArrayList empty. Return empty ArrayList

        8. name.contains(element) - that method checks if ArrayList has given element, return boolean

        9. name1.equals(name2) - checks if first ArrayList is equal to second(given) ArrayList(if the ArrayLists have similar elements in similar order, so, that method checks  if first and second ArrayLists are identical)

       10. name.indexOf(element) - return first index of given element. Return int type;
       10.1 name.lastindexOf(element) - return last index of given element. return type is int

        11. name.set(index, element) - replece the element at the given index with given new element (acts like replace method for string)

        // Bulk Operation Methods (accapt as parametrs only collection type)
        12. containsAll(collectionType) - checks if the arrayList contains all the given collection of values. We need to define elements in prentecis as collection type, that whae we always use cpatial method Arrays.asList()

        13. addAll(collectionType) - allow us add all given values to the Arraylist at once. We need to define elements in prentecis as collection type, that why we always use spacial method Arrays.asList()

        14. removeAll(collectionType) -remove all matching values from Arraylist. We need to define elements in prentecis as collection type, that why we always use special method Arrays.asList()

        15 retainAll(collectionType) (переводится удерживать, оставлятьб сохранять) - allow as to remove all unmathing elements from ArrayList. Keep in ArrayList the matching elements. We need to define elements in prentecis as collection type, that why we always use special method Arrays.asList()

        LAMBDA METHODS
        16. ArrayList.removeIf( element -> boolean expression) - используется как упрощенная версия цикла со встроенным удалением елемента отвечающего boolean expression. Lambda - это специальный синтаксис, выражающийся через указание  -> (-> arrow). Boolean expresion может быть сколь угодно сложным. Ьы не можем использовать класический loop + remove method при определенный условиях if, т.к. при класическом лууп лист будет сокращаться автоматически, и сдуюзий за уделенным элементом элемент будет занимать индекс уже удаленного элемента и не будет проверяться при следующей итерации, таким образом output может быть некорректным. Соответственно в этих случаях необходимос использовать removeIf lambda method

        17. names.forEach(element -> what need to do) - еще один способ выполнять циклы






       12.Just for reminder
       (how to convert Array to ArrayList)
        этот метод из java.util.Arrays,
                8.Arrays.asList(arr); // this method convert arr to arrList and we can  just type our elements in created ArrayList without creating arr first


                 */


        //1. print whole arraylist
        ArrayList<Character> letters1 = new ArrayList<>();
        letters1.add('a');// converted to autoboxing
        letters1.add('p');// converted to autoboxing
        letters1.add('p');// converted to autoboxing
        letters1.add('l');// converted to autoboxing// we can add as many element as we want and size will change automatically
        System.out.println(letters1); // print whole arraylist

        System.out.println("=========================================");
        //2. name.size()
        ArrayList<Character> letters = new ArrayList<>(); // created an ampty ArrayList//but internal capacity by default 10 (capacity not affect anything)
        System.out.println(letters.size());// 0 -> empty
        letters.add('j');// converted to autoboxing
        letters.add('a');// converted to autoboxing
        letters.add('v');// converted to autoboxing
        letters.add('a');// converted to autoboxing
        System.out.println(letters.size());// number of element ->4
        System.out.println(letters); // print whole arraylist
        System.out.println("==============================================");

        // 3. name.add(element)
        ArrayList<Character> letter = new ArrayList<>();
        letter.add('j');// converted to autoboxing
        letter.add('a');// converted to autoboxing
        letter.add('v');// converted to autoboxing
        letter.add('a');// converted to autoboxing// we can add as many element as we want and size will change automatically
        System.out.println(letters.size());// number of element ->4


        System.out.println("=========================================================");
       // 3.1.  name.add(index, element) add giving element on position of giving index.

        ArrayList<Character> letters2 = new ArrayList<>();
        letters2.add('j');// converted to autoboxing
        letters2.add('a');// converted to autoboxing
        letters2.add('v');// converted to autoboxing
        letters2.add('a');//
        System.out.println(letters2);
        letters2.add(1, '$');
        System.out.println(letters2); // элемент который ранее находился под индексом 3 смещается
        letters2.add(3, '8'); // элемент который ранее находился под индексом 3 смещается вперед
        System.out.println(letters2);

        System.out.println("=====================================================");
       // 4. name.get(index) - return element of given index, return element


        ArrayList<Character> letters3 = new ArrayList<>();
        letters3.add('p');
        letters3.add('h');
        letters3.add('o');
        letters3.add('n');
        System.out.println(letters3.get(0)); // arraylist has own method to read element from list by indexes
        System.out.println(letters3.get(1));
        System.out.println(letters3.get(2));
        System.out.println(letters3.get(3));
        //System.out.println(letters.get(4));Index 4 out of bounds for length 4

        System.out.println("===========================================================");

        // 5. name.remove(element) - remove given element from ArrayList. Return boolean. True if removed element successful, false if there is no element in list that need to be removed
        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);
        words.remove("today");// return boolean, will be true if removed succsess, false - if not
        System.out.println(words); // list without "today'
        System.out.println(words.remove("cow")); // return false because there is no "cow"
        System.out.println(words.remove("java")); // removed "java"
        System.out.println(words); // list without "java"

        System.out.println("==============================================================");
        /*5.1 name.remove(index) - remove element in position of given index. Return removed element if we wont to use removed element in future
         */

        ArrayList<String> words1 = new ArrayList<>();
        words1.add("Eva");
        words1.add("Sergei");
        words1.add("Katy");
        words1.add("Etel");
        System.out.println(words1);
      String moved =  words1.remove(2); // return element that we remove // мы може м положить это элемент в
        System.out.println(moved); // напечатает удаленный элемент
        System.out.println(words1.remove(2));//покажет что будет удалать в этом случае
        System.out.println(words1);
        System.out.println(words1.remove(0));//покажет что будет удалать в этом случае
        System.out.println(words1);

        // особенность удаления из ArrayList <Integer>
        // удаление по индексам name.remove(element)
        // 1) способ
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);
        System.out.println(nums);
        nums.remove(0);// без кастинга код автоматически рассматривает данную цифру как номур индекса в итоге удаляет первое число 4 (т.к. оно под индексом 0). ТАким образом удаление по индексам не вызывает проблем в ArraysList <Integer>.
        System.out.println(nums);

        // 2) способ
        ArrayList<Integer> num = new ArrayList<>();
        num.add(800);
        num.add(300);
        num.add(400);
        num.add(300);
        System.out.println(nums);
        int indexOfFour = num.indexOf(400);
        System.out.println(indexOfFour); // 2
        int removed = num.remove(indexOfFour); // 400
        System.out.println(removed);
        System.out.println(num);

        System.out.println("==========================================");
        // КАК УДАЛЯТЬ через указываение ЭЛЕМЕНТОВ name.remove(element) в ArrayList(Integer)
        //1) способ
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(4);
        nums3.add(5);
        nums3.add(0);
        nums3.add(2);
        nums3.add(4);
        System.out.println(nums3);

        Integer a = 0;
        nums3.remove(a); // a as Integer, so I remove by ELEMENT, the element it  removes 0
        System.out.println(nums);

        // 2) способ
        nums3.remove((Integer) 2);// casting to Integer type and i can remove element not the index 2 (т.е. нужно определить что это элемент в листе а не индекс, это можно легко сделать показав коду что удаляем INTEGER, т.к. ArrayList может соржать только объекты(нон примитив типы) для int - это UNTEGER
        System.out.println(nums3);

        System.out.println("=================================================");

      //  6.name. ismpty() - checks if there are any elements in ArrayList, return boolean.
        //
        //  7.name. clear() - make ArrayList empty

        ArrayList<Integer> list5 = new ArrayList<>();
        System.out.println(list5.isEmpty());
        list5.add(4);
        list5.add(5);
        list5.add(41);
        list5.add(5512);
        list5.add(413);
        System.out.println(list5);
        System.out.println(list5.isEmpty());

        System.out.println("========================================================");

        //7.name. clear() - make ArrayList empty
        ArrayList<Integer> list6 = new ArrayList<>();
        System.out.println(list6.isEmpty());
        list6.add(4);
        list6.add(5);

        System.out.println(list6);
        list6.clear();// emptyes the whole arraylist
        System.out.println(list6);

        System.out.println("=========================================================");
       // 8. name.contains(element) - that method checks if ArrayList has given element, return boolean
        ArrayList<Integer> list8 = new ArrayList<>();
        list8.add(4);
        list8.add(5);
        list8.add(41);
        list8.add(5512);
        list8.add(413);
        System.out.println(list8);
        System.out.println("contains 41 " + list8.contains(41));
        System.out.println("contains 1 " + list8.contains(1));

        System.out.println("================================================================");

       /* 9. name1.equals(name2) - checks if first ArrayList is equal to second(given) ArrayList(if the ArrayLists have similar elements in similar order, so, that method checks  if first and second ArrayLists are identical)
        */
        ArrayList<Integer> list9 = new ArrayList<>();
        list9.add(4);
        list9.add(5);
        list9.add(5);

        ArrayList<Integer> list10 = new ArrayList<>();
        list10.add(41);
        list10.add(5512);
        list10.add(413);
        System.out.println(list9.equals(list10));

        System.out.println("===============================");
        // 10. mane.indexOf(element) - return first index of given element. Return int type
        // 10.1 name.lastindexOf(element) - return last index of given element. return type is int

        ArrayList<String> str = new ArrayList<>();
        str.add("friday");
        str.add("off");
        str.add("study");
        str.add("relax");
        System.out.println(str);
        int indexOfRelax = str.indexOf("relax"); //3
        System.out.println(indexOfRelax);//3
        str.set(indexOfRelax, "coding");
        System.out.println(str);

        System.out.println("=========================================================");

        // 11. name.set(index, element) - replece the element at the given index with given new element (acts like replece method for string)

        ArrayList<Integer> list11 = new ArrayList<>();
        list11.add(4);
        list11.add(9);
        list11.add(0);
        list11.add(12);
        list11.add(9);
        System.out.println(list11);

        list11.set(2, 10); // поменял элемент под индексом 2 на элемент 10
        System.out.println(list11);
        list11.set(0, 2);// поменял элемент под индексом 0 на элемент 10
        System.out.println(list11);


        System.out.println("==============================================================");

      /*  12. containsAll(collectionType) - checks if the arrayList contains all the given collection of values. We need to define elements in prentecis as collection type, that why we always use special method Arrays.asList()
         */

        ArrayList<Integer> list12 = new ArrayList<>();
        list12.add(4);
        list12.add(9);
        list12.add(0);
        System.out.println(list12.containsAll(Arrays.asList(0,9,4))); // return true
        System.out.println(list12.containsAll(Arrays.asList(9,4))); // return true
        System.out.println(list12.containsAll(Arrays.asList(0,9,41))); // return false

        System.out.println("==================================================================");
        //BULK OPETATION METHODS
       // 13. addAll(collectionType) - addAll(collectionType) - allow us add all given values to the Arraylist at once. We need to define elements in prentecis as collection type, that why we always use special method Arrays.asList()
        ArrayList<Integer> list13 = new ArrayList<>();
        list13.add(401);
        list13.add(902);
        list13.add(98);
        System.out.println(list13);
        list13.addAll(Arrays.asList(0,9,4)); // 401, 902, 98, 0, 9, 4
        System.out.println(list13);

         //       14. removeAll(collectionType) - remove all matching values from ArrayLIst at once. We need to define elements in prentecis as collection type, that why we always use special method Arrays.asList()
        ArrayList<Integer> list14 = new ArrayList<>();
        list14.add(401);
        list14.add(902);
        list14.add(98);
        list14.add(98);
        list14.add(5);
        list14.add(9);
        System.out.println(list14);
        list14.removeAll(Arrays.asList(401,1,98,902));
        System.out.println(list14);

          //      15 retainAll(collectionType) (переводится удерживать, оставлятьб сохранять) - allow as to remove all unmathing elements from ArrayList. Keep in ArrayList the matching elements. We need to define elements in prentecis as collection type, that why we always use special method Arrays.asList()

        ArrayList<Integer> list15 = new ArrayList<>();
        list15.add(401);
        list15.add(902);
        list15.add(98);
        list15.add(98);
        list15.add(5);
        list15.add(9);
        System.out.println(list15);
        list15.retainAll(Arrays.asList(98, 5));// only that element will retain in ArreyList, rest of elemtntes are removed
        System.out.println((list15));


        System.out.println("========================================================");

        //16. ArrayList.removeIf( element -> boolean expression) - используется как упрощенная версия цикла со встроенным удалением елемента отвечающего boolean expression.  Lambda - это специальный синтаксис, выражающийся через указание  -> (-> arrow). Boolean expresion может быть сколь угодно сложным

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,4,5,7,3,4,5,0,6,7,8,3,4,10,9));// remove all the numbers are less 5 - using removeIf
        nums2.removeIf(n -> n < 5); // n will be every element. n - this is every element of ArrayList, -> lambda(arrow is part of sintax), so we remove numbers we need without loop, dont need to handle with skiping indexes which exist with looping,
        System.out.println(nums2);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Segei", "Eva", "Ekaterina", "Ethel", "Anatoliy", "Liubava", "Cot", "Sot"));
        System.out.println(names);

        ArrayList<String>bylength = new ArrayList<>(names);
        bylength.removeIf(name -> name.length() < 4);
        System.out.println(bylength);

        System.out.println("====================LAMBDA EXAMPLE====================");
        System.out.println(names);
        ArrayList<String> byFirstLetter = new ArrayList<>(names);
        byFirstLetter.removeIf(p -> p.startsWith("E") || p.startsWith("A"));
        System.out.println(byFirstLetter);

        System.out.println("====================LAMBDA EXAMPLE====================");
        System.out.println(names);
        ArrayList<String> byLastLetter = new ArrayList<>(names);
        byLastLetter.removeIf(p -> !p.endsWith("a"));
        System.out.println(byLastLetter);

        System.out.println("====================LAMBDA EXAMPLE====================");
        System.out.println(names);
        for (String eachElement : names){
        System.out.println(eachElement);
        }

        System.out.println("======================================");

        //17. names.forEach(element -> what need to do with element) - LAMBDA METHOD - еще один способ выполнять циклы

        ArrayList<String> names8 = new ArrayList<>(Arrays.asList("Segei", "Eva", "Ekaterina", "Ethel", "Anatoliy", "Liubava", "Cot", "Sot"));
        names8.forEach(eachElement -> System.out.println(eachElement));// print every element from ArrayList

        names8.forEach(eachElement -> System.out.println(eachElement.charAt(0) + " " + eachElement.charAt(eachElement.length()-1)));



        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        /*
         12.Just for reminder
        этот метод из java.util.Arrays,
                8.Arrays.asList(arr); // this method convert arr to arrList and we can  just type our elements in created ArrayList without creating arr first
         */

        //8.Arrays.asList(arr); // this method convert arr to arrList

        //how to convert Array to ArrayList

        int[] arr90 = {1,2,3,4,5};

        Arrays.asList(arr90); // this method convert arr to arrList
        // creating an ArrList with initial values
        //ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr))// не могу сделать так потому, что элементы Arr are int, а ArrayList может содержать только non primitive data types

        System.out.println("=================================================");
        Integer[] arr3 = {1,2,3,4}; // wrapper type

        ArrayList<Integer> num2 = new ArrayList(Arrays.asList(arr3)); // works because now arr include not int, but INTEGER - wrapper class (non-primitive


        // The way we will usually create an ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,8)); // создали Arraylist с уе известными нам элементами most time wi will use that way
        System.out.println(list);

        System.out.println("=======================");

        ArrayList<String> names15 = new ArrayList<>(Arrays.asList("Sergei", "Eva", "Katy", "Etel"));// создали Arraylist с  известными нам элементами

        System.out.println(names15);



    }

}
