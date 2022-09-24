package day28javamethods;

public class SmalleatNumberArr {

/*
Min Number

create a method that will accept an int array and return the
smallest number from the array

 */
public static void main(String[] args) {

    int[] a = {5,1,4,-1,99};

    System.out.println(smallestNum(a));
    System.out.println(biggestNum(a));
}

// smallest element of the arr

    public static int smallestNum(int[] arr){
        int smallest = 0;
        for(int each : arr) {
            if(smallest > each)
                smallest = each;
        }

        return smallest;

    }

// biggest element of arr

    public static int biggestNum (int[] arr){
    int biggest = 0;
    for(int each : arr){
        if(biggest < each){
            biggest = each;
        }
    }
    return biggest;
    }


}
