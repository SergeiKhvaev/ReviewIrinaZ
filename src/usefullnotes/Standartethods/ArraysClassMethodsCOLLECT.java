package usefullnotes.Standartethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysClassMethodsCOLLECT {
    public static void main(String[] args) {
        /*
        Arrays class methods - located in java.util.Arrays class, if we want to apply Arrays class methods we have to import method we need those (происходит автоматически) , т.е. эти методы находсятся в классе Arrays, который в свою очередь находится в Util packege
        1. Arrays.toString(arr) - print whole array in String format. Return array as String
        2. Arrays.sort(arr) - sort int [] - where all elements of array starts from smallest to biggest. String[] - sore alphfabettically (lixografically) from a->z, from A->Z, if Array contains special charactrs(#,&,$)сначала идут специальные символы, потом цифры, потом буквы верхнего регистра, затем буквы нижнего регистра. Do not creat new array, but sort already existed array
        3. Arrays.equals(arr1, arr2) - compare two arrays. Checks two arrays have exactly same elements. Return boolean
        4. Arrays.binarySearch(arr, element) - (arr - name of array, element - name of element which index we need). looking for index of element of array. In order to that method array must be sorted. Если будем искать несуществующий в массиве элемент то вернет отрицательное число. Этот метод может применяться как к int[]? так и к String[]
        5. Arrays.copyOf(arr, size of new arr) -make copy of given array. finally we have different array - given array and copy of given array
        6. Arrays.deepToString(arr - name of multi array); // Этот метод используется для распечатки многоуровнегового массива
        7.String.join("" ,arr) - добавляет необходмые символы между елементами массива, возварщает Стринг
        System.out.println(String.join("#", strs1));
        8.Arrays.asList(arr); // this method convert arr to arrList and we can  just type our elements in created ArrayList without creating arr first (how to convert Array to ArrayList)
        9. name of arr.length - количество элементов массива (размер массива)

 // String to array methods
        // 10. toCharArray() convert string to char[] where every chrar of string will present as element of array
        // 12/ split("") split of string at parts and convert it to String[], where every element of array is part/ Parts defined by inside brackets("") for example split(",") or (" ")

         */

//Arrays.toString method
        int[] nums = {1,2,3,5,7,2,7,9,4,2,7};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);// меняет порядок в нтри заданного массива, поэтому его не нужно никуда переназначать, он выдается с новым порядком элементов и все
        System.out.println(Arrays.toString(nums));
        System.out.println("min - " + nums[0]);
        System.out.println("max - " + nums[nums.length-1]);

       Integer k = 100;

       int l = k;

        System.out.println("------------------------------------");

        String[] strs = {"hello", "world", "4four", "#zebra", "apple", "bee", "1aaaaaaa"};
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs)); // сравнивает по ACII table// сначала идут специальные символы, потом цифры, потом буквы верхнего регистра, затем буквы нижнего регистра


        System.out.println("====================================");

        //Arrays.equals(arr1, arr2) method
        int [] a = {1,2,3};
        int [] b = {1,2,3};
        int [] c = {1,2,4};
        int [] d = {3,2,1};// но мы можем sort этот массив, тогда он будет equals  с а, и массивами

        System.out.println(Arrays.equals(a,b)); // true
        System.out.println(Arrays.equals(a,c)); // false
        System.out.println(Arrays.equals(a,d)); // false

        System.out.println("------------------------------------");




        //Arrays.binarySearch(arr, element)

        int[] arr = {6,23,10,40, 240}; // массив создан уже в натурально сортированном виде, в противном случае нужно сортировать
        System.out.println(Arrays.binarySearch(arr, 240));
        System.out.println(Arrays.binarySearch(arr, 2000)); // если ищем не существующий элемент, будет отрицательное число

        System.out.println("================================================================");


        //
        int[] b1 = {6,3,7,2,9,-14};
        //0 1 2
        System.out.println(Arrays.binarySearch(b1,3));// не выдает , т.к. не отсортерованный масива
        Arrays.sort(b1); // сортируюем массив
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(b1,3));//выдает верный ответ, т.к. массив отсортирован
        System.out.println(Arrays.binarySearch(b1,-14));
        System.out.println(Arrays.binarySearch(b1,5)); // если ищем не существующий элемент, выдает отрицательное число


        String [] words ={"hello", "world", "zebra", "water"};
       Arrays.sort(words); // сортиируем
        System.out.println(Arrays.toString(words));

        System.out.println(Arrays.binarySearch(words, "world"));// выдает индекс этого элемента в массиве
        System.out.println(Arrays.binarySearch(words, "ass"));// выдает отрицательное число, если ищем несуществующий в массиве элемент


        //Arrays.toCopy()

        int[] a2 = {5,10,18};
        int [] b2 = Arrays.copyOf(a,3);// мы создали копию массива a, но это НОВЫЙ МАССИВ
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(b2));
        System.out.println("----------");

        a2[1] = 100;// изменили элемента в массиве а, соответственно этот элемент в копии b не изменился, т.к. b это копися массива а, но все-таки b - это совсем новый массив
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(b2));


        System.out.println("====================================================");
        //Arrays.deepToString()

        String [][] cydeo = {
                {"Alen", "tina", "Alina", "NArgiza"},
                {"Sergei", "Ekaterina", "Eva", "Adam"},
                {"Etel", "Anatoliy", "Lubava"},
                {"Kety", "Olia", "Zarub", "Coba", "Toto"}

        };

        System.out.println(cydeo.length);// длинна многоуровнего массива -4, т.к. 4 элемента(4 простых массива) внутри
        System.out.println(cydeo[2].length); // длинна второго массива - 3
        System.out.println(cydeo[0][3]); // просим вывести первого массива 3 индекс - NArgiza
        System.out.println(Arrays.toString(cydeo[1])); // печатаем массив под индексом 1 - {"Sergei", "Ekaterina", "Eva", "Adam"},
        System.out.println(Arrays.deepToString(cydeo)); // распечатываем многоуровневый массив полностью

        System.out.println("==================================");
        ///String.join

        String[] strs1 ={"Hello", "world", "monday", "java"};
        System.out.println(Arrays.toString(strs1));
        System.out.println(String.join("#", strs1));
        System.out.println(String.join(" ", strs1));
        System.out.println(String.join(" MIDDLE ", strs1));

     System.out.println("==============================================================");
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

     ArrayList<String> names = new ArrayList<>(Arrays.asList("Sergei", "Eva", "Katy", "Etel"));// создали Arraylist с  известными нам элементами

     System.out.println(names);

     System.out.println("==============================");

     //9. name of arr.length - количество элементов массива (размер массива)
     String[] strs2 ={"Hello", "world", "monday", "java"};

     System.out.println(strs2.length);// 4

     System.out.println("===============================");

     // 10. toCharArray() convert string to char[] where every chrar of string will present as element of array

     // toCharArray
     String str = "hello world";
     char[] array = str.toCharArray(); // перевели Стринг в char [] array
     System.out.println(Arrays.toString(array));
     System.out.println(str.length());// counts number of char
     System.out.println(array.length);// counts numbers of array elemetns
     System.out.println(array[0]);


     // 12/ split("") split of string at parts and convert it to String[], where every element of array is part/ Parts defined by inside brackets("") for example split(",") or (" ")

     // split()
     String str12 ="Mondeq, tusday, wendsday, thursday, friday, suturday, sunday";
     String []arr2= str12.split(","); // перевели строку в String [] where elements devided by ","
     System.out.println(Arrays.toString(str12.split(",")));// перевели строку в String [] where elements devided by "," и распечатали
     System.out.println(arr.length);
     for(String each : str12.split( ",")){
      System.out.println(each);
     }




    }

}
