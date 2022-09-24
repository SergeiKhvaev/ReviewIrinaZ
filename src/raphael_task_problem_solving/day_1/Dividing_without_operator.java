package raphael_task_problem_solving.day_1;

public class Dividing_without_operator {
    /*
    Numbers - divide without '/' operator
    Write method? that can divide two num without applying division operator
     */
    public static void main(String[] args) {

        wayToDivide(15,5);
    }

    public static void wayToDivide(int operandOne, int operandTwo) {

      int counter = 0;

        while(operandOne >= operandTwo) {
            operandOne = operandOne - operandTwo;
            counter ++;
        }

        System.out.println(counter);

       /*


        int counter = 0;
        for(int i = operandOne ; i <= 0 ; i = i - operandTwo){
            counter++;

        }
        System.out.println(counter);

        */






        }

    }



