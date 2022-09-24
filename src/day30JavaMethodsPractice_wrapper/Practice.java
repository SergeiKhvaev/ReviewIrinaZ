package day30JavaMethodsPractice_wrapper;

public class Practice {

    /*
    Min Number
create a method that will accept an int array and return the
smallest number from the array

Max Number
create a method that will accept an int array and
return the biggest number from the array

     */

    // min num in Arr

    public static void main(String[] args) {

    }

    public static int minFromArr(int... arr) {// same int...[] arr
        int minNum = arr[0];
        for (int each : arr) {
            if (each < minNum) {
                minNum = each;
            }
        }
        return minNum;
    }




    // max

    public static int maxFromArr(int...arr) { // same int...[] arr

        int maxNum = arr[0];
        for (int each : arr) {
            if (each > maxNum) {
                maxNum = each;
            }
        }
        return maxNum;

    }


/*
Contains
create a method that will accept an int array and an int number.
Check and return if the given number is in the array.
 */

    public static boolean contains (int [] arr, int num){// int ... arr, int num - при двойном параметре так писать массив нельзя, но можно поставить массив последним в параметре, тогда пойдетб код будет понимать что первок число это int, остадльные - это элементы массива
        for(int each: arr){
            if(each == num){
                return true;// если находится число то return останавливает дальнейший код, return работает как break key word
            }
        }

        return false; //  предпалагаем, что числа нет в массиве
    }

/*
IndexOf
create a method that will accept an int array and an int number.
Find and return the index of the number in the array.
If there is multiple occurrence return the first occurrence's index
 */

public static int indexOf(int[] arr, int num){// сорт и байнари не подходет, т.к. сорт поменяет изначальный индекс искомого числа

    for(int i = 0; i < arr.length; i++){
        if(arr[i] == num){
            return i;// это будет индекс
        }
    }

    return -1;// число не найдено
}


// find index of next number occurance
public static int indexOf(int[] arr, int targetNum, int startIndex){ // не динамичный вариант

    for(int i = startIndex; i < arr.length; i++){
        if(arr[i] == targetNum){
            return i;// это будет индекс
        }
    }

    return -1;// число не найдено




}

    /*
    Add Element
create a method that will accept a String array and a String element.
Add the given element value into the end of the array. Do not replace
the last index of the given array,
but instead create a new array with a bigger size to fit all the
original elements plus the new one
     */

    public static String [] addElement (String[] arr, String element){

        String[] newArr = new String[arr.length+1];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = element;
        return newArr;

    }

    /*
    Add Element
overload the add element method to accept two String arrays.
For this one add all the given elements from the second array
in the the first array.
Ex:
	{"today", "is", "monday"}
	{"no", "softskills", "today"}
output > [today, is, monday, no, softskills, today]
     */

public static String [] addElement(String [] original, String[] other){
    String[] merged = new String[original.length + other.length];
    for(int i = 0; i < original.length; i++){
        merged[i] = original[i];
    }
// option^ int i = 0, j = original.length; j++
for(int i = 0; i< other.length; i++){    // читает элементы второго элемента и кладет их в новый элемент
merged[original.length+ i] = other[i];
}
return merged;
}




}




