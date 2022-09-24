package day17_strings_loops;

public class whileLoopIntroduction {
    public static void main(String[] args) {


        //System.out.println("hello World!"); // how to print it 10 times easly. need tu build loop aroude that staitmente

        int counter = 1;
        while(counter <= 50) {

            System.out.println("hello World!" + counter);
            counter ++; //  мы использовали постинкрементинг через эту часть мы увеличиваем counter на 1 при каждом цикле == counter = counter +1;
        }
    }
}
