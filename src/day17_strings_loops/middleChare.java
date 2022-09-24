package day17_strings_loops;

public class middleChare {

    public static void main(String[] args) {
        // ели столо четное - две буквы с середины, если нечетное - одну буку с середины

        String str = "cara";
      //              01234

        int halfLength = str.length() / 2;


        if (str.length() % 2 == 0){
            System.out.println(str.substring(halfLength-1, halfLength + 1));

        } else {
            System.out.println(str.substring(halfLength, halfLength +1));

        }




        // ant - odd  door - even
        // 012        0123
        // 123        1234
        int halfLength1 = str.length() / 2;


        if (str.length() % 2 == 1){
            //в нечетном слове, длинна слова деленная на 2 будет выдавать индекс серединной буквы
            int midIndex = str.length() / 2;
            System.out.println("middle char " + str.charAt(midIndex));

        } else {
            int startMid = str.length() / 2 - 1;
            int endMid = str.length() / 2;
            System.out.println("Middle characters " + str.charAt(startMid) + str.charAt(endMid));
            System.out.println("Middle characters " + str.substring(startMid, endMid +1));

        }




    }

}
