package day23ArraysLoopForEachLoops;

public class ArrayForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        for(int eachNumber : nums){ // возвращает каждый елемент из масива с начала до конца, в eachNumber при каждой итерации помещается каждый элемент массива nums
            System.out.println(eachNumber);
        }

    }
}
