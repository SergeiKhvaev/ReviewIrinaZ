package usefullnotes.Standartethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysClassMethodsCOLLECT {
    public static void main(String[] args) {
        /*
        Arrays class methods - located in java.util.Arrays class, if we want to apply Arrays class methods we have to import method we need those (���������� �������������) , �.�. ��� ������ ���������� � ������ Arrays, ������� � ���� ������� ��������� � Util packege
        1. Arrays.toString(arr) - print whole array in String format. Return array as String
        2. Arrays.sort(arr) - sort int [] - where all elements of array starts from smallest to biggest. String[] - sore alphfabettically (lixografically) from a->z, from A->Z, if Array contains special charactrs(#,&,$)������� ���� ����������� �������, ����� �����, ����� ����� �������� ��������, ����� ����� ������� ��������. Do not creat new array, but sort already existed array
        3. Arrays.equals(arr1, arr2) - compare two arrays. Checks two arrays have exactly same elements. Return boolean
        4. Arrays.binarySearch(arr, element) - (arr - name of array, element - name of element which index we need). looking for index of element of array. In order to that method array must be sorted. ���� ����� ������ �������������� � ������� ������� �� ������ ������������� �����. ���� ����� ����� ����������� ��� � int[]? ��� � � String[]
        5. Arrays.copyOf(arr, size of new arr) -make copy of given array. finally we have different array - given array and copy of given array
        6. Arrays.deepToString(arr - name of multi array); // ���� ����� ������������ ��� ���������� ����������������� �������
        7.String.join("" ,arr) - ��������� ���������� ������� ����� ���������� �������, ���������� ������
        System.out.println(String.join("#", strs1));
        8.Arrays.asList(arr); // this method convert arr to arrList and we can  just type our elements in created ArrayList without creating arr first (how to convert Array to ArrayList)
        9. name of arr.length - ���������� ��������� ������� (������ �������)

 // String to array methods
        // 10. toCharArray() convert string to char[] where every chrar of string will present as element of array
        // 12/ split("") split of string at parts and convert it to String[], where every element of array is part/ Parts defined by inside brackets("") for example split(",") or (" ")

         */

//Arrays.toString method
        int[] nums = {1,2,3,5,7,2,7,9,4,2,7};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);// ������ ������� � ���� ��������� �������, ������� ��� �� ����� ������ �������������, �� �������� � ����� �������� ��������� � ���
        System.out.println(Arrays.toString(nums));
        System.out.println("min - " + nums[0]);
        System.out.println("max - " + nums[nums.length-1]);

       Integer k = 100;

       int l = k;

        System.out.println("------------------------------------");

        String[] strs = {"hello", "world", "4four", "#zebra", "apple", "bee", "1aaaaaaa"};
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs)); // ���������� �� ACII table// ������� ���� ����������� �������, ����� �����, ����� ����� �������� ��������, ����� ����� ������� ��������


        System.out.println("====================================");

        //Arrays.equals(arr1, arr2) method
        int [] a = {1,2,3};
        int [] b = {1,2,3};
        int [] c = {1,2,4};
        int [] d = {3,2,1};// �� �� ����� sort ���� ������, ����� �� ����� equals  � �, � ���������

        System.out.println(Arrays.equals(a,b)); // true
        System.out.println(Arrays.equals(a,c)); // false
        System.out.println(Arrays.equals(a,d)); // false

        System.out.println("------------------------------------");




        //Arrays.binarySearch(arr, element)

        int[] arr = {6,23,10,40, 240}; // ������ ������ ��� � ���������� ������������� ����, � ��������� ������ ����� �����������
        System.out.println(Arrays.binarySearch(arr, 240));
        System.out.println(Arrays.binarySearch(arr, 2000)); // ���� ���� �� ������������ �������, ����� ������������� �����

        System.out.println("================================================================");


        //
        int[] b1 = {6,3,7,2,9,-14};
        //0 1 2
        System.out.println(Arrays.binarySearch(b1,3));// �� ������ , �.�. �� ��������������� ������
        Arrays.sort(b1); // ���������� ������
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(b1,3));//������ ������ �����, �.�. ������ ������������
        System.out.println(Arrays.binarySearch(b1,-14));
        System.out.println(Arrays.binarySearch(b1,5)); // ���� ���� �� ������������ �������, ������ ������������� �����


        String [] words ={"hello", "world", "zebra", "water"};
       Arrays.sort(words); // ����������
        System.out.println(Arrays.toString(words));

        System.out.println(Arrays.binarySearch(words, "world"));// ������ ������ ����� �������� � �������
        System.out.println(Arrays.binarySearch(words, "ass"));// ������ ������������� �����, ���� ���� �������������� � ������� �������


        //Arrays.toCopy()

        int[] a2 = {5,10,18};
        int [] b2 = Arrays.copyOf(a,3);// �� ������� ����� ������� a, �� ��� ����� ������
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(b2));
        System.out.println("----------");

        a2[1] = 100;// �������� �������� � ������� �, �������������� ���� ������� � ����� b �� ���������, �.�. b ��� ������ ������� �, �� ���-���� b - ��� ������ ����� ������
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

        System.out.println(cydeo.length);// ������ ������������� ������� -4, �.�. 4 ��������(4 ������� �������) ������
        System.out.println(cydeo[2].length); // ������ ������� ������� - 3
        System.out.println(cydeo[0][3]); // ������ ������� ������� ������� 3 ������ - NArgiza
        System.out.println(Arrays.toString(cydeo[1])); // �������� ������ ��� �������� 1 - {"Sergei", "Ekaterina", "Eva", "Adam"},
        System.out.println(Arrays.deepToString(cydeo)); // ������������� �������������� ������ ���������

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
     //ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr))// �� ���� ������� ��� ������, ��� �������� Arr are int, � ArrayList ����� ��������� ������ non primitive data types

     System.out.println("=================================================");
     Integer[] arr3 = {1,2,3,4}; // wrapper type

     ArrayList<Integer> num2 = new ArrayList(Arrays.asList(arr3)); // works because now arr include not int, but INTEGER - wrapper class (non-primitive


     // The way we will usually create an ArrayList
     ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,8)); // ������� Arraylist � �� ���������� ��� ���������� most time wi will use that way
     System.out.println(list);

     System.out.println("=======================");

     ArrayList<String> names = new ArrayList<>(Arrays.asList("Sergei", "Eva", "Katy", "Etel"));// ������� Arraylist �  ���������� ��� ����������

     System.out.println(names);

     System.out.println("==============================");

     //9. name of arr.length - ���������� ��������� ������� (������ �������)
     String[] strs2 ={"Hello", "world", "monday", "java"};

     System.out.println(strs2.length);// 4

     System.out.println("===============================");

     // 10. toCharArray() convert string to char[] where every chrar of string will present as element of array

     // toCharArray
     String str = "hello world";
     char[] array = str.toCharArray(); // �������� ������ � char [] array
     System.out.println(Arrays.toString(array));
     System.out.println(str.length());// counts number of char
     System.out.println(array.length);// counts numbers of array elemetns
     System.out.println(array[0]);


     // 12/ split("") split of string at parts and convert it to String[], where every element of array is part/ Parts defined by inside brackets("") for example split(",") or (" ")

     // split()
     String str12 ="Mondeq, tusday, wendsday, thursday, friday, suturday, sunday";
     String []arr2= str12.split(","); // �������� ������ � String [] where elements devided by ","
     System.out.println(Arrays.toString(str12.split(",")));// �������� ������ � String [] where elements devided by "," � �����������
     System.out.println(arr.length);
     for(String each : str12.split( ",")){
      System.out.println(each);
     }




    }

}
