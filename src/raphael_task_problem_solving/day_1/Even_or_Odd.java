package raphael_task_problem_solving.day_1;

public class Even_or_Odd {
    public static void main(String[] args) {

        evenOrOdd(664);
        evenOrOdd(5);
        evenOrOdd(0);

    }

    public static void evenOrOdd(int num){
        if(num != 0){
        if(num % 2 == 0){
            System.out.println(num + " is EVEN");
        } else if(num % 2 != 0) {
            System.out.println(num + " is ODD");
        }
        } else {
            System.out.println(num + " is ZERO");
        }
    }
}
