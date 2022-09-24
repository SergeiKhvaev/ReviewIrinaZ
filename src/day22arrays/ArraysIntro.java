package day22arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int [] nums; // declarinfg an int array
        nums = new int[5]; // initialazing the array with 5 spaces
        // so far this is our array : [0, 0, 0, 0, 0]. Array is the object (collection vareibles), array is non-primitive type            0  1  2  3  4   - indexes
        System.out.println(nums[0]); // access one (first) element


        nums[0] = 10; // change the first element to be 10, assigning 10 to index 0
        System.out.println(nums[0]); //access one (first) element

        nums[3] = 25;
        System.out.println(nums[3]);// at this point array is [10, 0, 0, 25, 0]

        // если мы знаем все переменные сразу, мы можем из поместить в массив с самого начала
        int [] other ={5, 6, 10, -8, 20, 12};// declaring and asssigning with values
        System.out.println(other[1]); // 6
        System.out.println(other[4]); // 20
        System.out.println(other[100]); // outOfBounce -> index does not exist






    }

}
