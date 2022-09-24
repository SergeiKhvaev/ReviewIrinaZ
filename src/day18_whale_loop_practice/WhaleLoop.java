package day18_whale_loop_practice;

public class WhaleLoop {
    public static void main(String[] args) {

        // even and odd

        int limit = 100;
        int count = 1;
        // print all even numbers;
        while(count <= limit) {
            if(count % 2== 0) {
                System.out.print(count + " ");
            } // здесь заканчивается IF стайтмент, поэтому шаг цикла определяем за IF статмейнт;
            count++; // определили шаг исполнения цикла;
        }

        System.out.println("=====================================");

        // печатать odd от 1;

        int back = limit;

        while(back >= 1) {
            if(back % 2 == 1){
                System.out.print(back+ " ");
            }
            back --;

        }
        System.out.println(back);
        System.out.println(back);












    }
}
