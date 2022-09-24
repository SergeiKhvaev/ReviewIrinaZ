package day12;

public class WhileLoopCountMySelf {
    public static void main(String[] args) {


        int count = 1;
        int limit = 100;

        while(count <= limit) {
            System.out.print(count + " ");
            count = count + 3;
        }

        System.out.println(" ");
        System.out.println("=================================================");

        // reverse count

        int count1 = 1;
        int starts = 100;

        while(starts >= count1){
            System.out.print(starts + " ");
            starts = starts - 4;
        }


    }
}
