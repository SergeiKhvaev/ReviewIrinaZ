package usefullnotes.WayToCreate;

import java.util.Arrays;

public class HowToCreateArray {
    public static void main(String[] args) {
        // array is special type of variable, which hold multiple types of  variables(primitiv and non-primitives values
        // 1. Declaration and instantiation of array. In this way we use "new" key word String [] str = new String[int]
        // 2. Declaration and instantiation of array if we initially know all values of Array  int [] other ={5, 6, 10, -8, 20, 12}
        // 3.  copying of existed array. When we use Arrays methot copyOf() - we create copy of existed array and this copy is new array, so after copyOf(arrname, int(size)) method applying we have two separet arrays

                        // Multy demensional Array
        // 1 Multy Dimentional Arrays - this is array inside array. Creating M Array using key word "new" - int [][] array2D = new int[3][]
        // 2 Multy dimentional array - Creating M Array with initially knowing values



       // 1. Declaration and instantiation of array. In this way we use "new" key word String [] str = new String[]
        String [] str = new String[5]; // created String Array, which can hold 5 values. 5 is size of array, we obligated define size of Array in this way of array cration
        str[0] = "I"; // assigh values in each element of Array one by one
        str[1] = "love";
        str[2] = "java";
        str[3] = "programing";
        str[4] = "language";
        System.out.println(Arrays.toString(str));


        // 2. Declaration and instantiation of array if we initially know all values of Array  int [] other ={5, 6, 10, -8, 20, 12}
        int [] nums ={5, 6, 10, -8, 20, 12};// declaring and asssigning with values
        System.out.println(nums[1]); // 6
        System.out.println(nums[4]); // 20
       // System.out.println(other[100]); // outOfBounce -> index does not exist


        System.out.println("=====================================");
        // 3. copying of existed array. When we use Arrays methot copyOf() - we create copy of existed array and this copy is new array, so after (arrname, int(size)) method applying we have two separet arrays

        int[] a = {5,10,18};
        int [] b = Arrays.copyOf(a,3);// мы создали копию массива a, но это Ќќ¬џ… ћј——»¬
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[1] = 100;// изменили элемента в массиве а, соответственно этот элемент в копии b не изменилс€, т.к. b это копис€ массива а, но все-таки b - это совсем новый массив
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int [] v = {7,5,3,1};
        int[] d = Arrays.copyOf(v, v.length);
        System.out.println(Arrays.toString(v));
        Arrays.sort(d);// sort only copied Array
        System.out.println((Arrays.toString(d)));

        System.out.println("======================================================");
                            // Multy demensional Array
        // 1/ MultyDementional Arrays - this is array inside array. Creatind M Array using key word "new" - int [][] array2D = new int[3]

String [][] words = new String[3][]; // [] -first brekats for defining numbers of dimensions(we must define it), [] - second bracets - to define size of each inner array(optional)// So we created mylty dimentional array with three inner arrays

        // 2 Multy dimentional array - Creating M Array with initially knowing values

        int totalSum = 0;
        int totalElements = 0;
        int[][] nums2 = {
                {3,3,5,6,7},
                {3,5,7,8,9,6},
                {4,5,2,1,3,5,5}
        };
        for(int[] eachInnerArr: nums2){// looping througt 2d array nums
            int sum = 0; // resets for next array

            for(int eachNum : eachInnerArr){
                sum+= eachNum; // считаем суммы цифр в каждом массиве

            }
            System.out.println(Arrays.toString(eachInnerArr));
            System.out.println("Avarage: " + (double)sum / eachInnerArr.length);// считаем среднее при этом делаем кастинг в double
            totalSum+= sum;
            totalElements += eachInnerArr.length;

        }

    }
}
