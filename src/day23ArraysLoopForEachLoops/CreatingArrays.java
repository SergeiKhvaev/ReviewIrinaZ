package day23ArraysLoopForEachLoops;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {

    public static void main(String[] args) {
        // Student one
        // 0 - Id
        //1 - first name
        // 2 - second name
        // 3 butch num

        // if we have all information
        String[] studentOne ={"04", "Sergei", "Khvalev", "27"}; // создали уже заполненый массив
        System.out.println(Arrays.toString(studentOne));

        // we know numbers of elements, but dont know values of info
        String[] studentTwo = new String[4]; // создали массим размером 4
        //values we assighnet to array later
        studentTwo[0] = "10"; // заполняем каждый индекс массива
        studentTwo[1] = "Eva";// заполняем каждый индекс массива
        studentTwo[2] = "Starovoitova";// заполняем каждый индекс массива
        System.out.println(Arrays.toString(studentTwo)); // возвращаем массив в консоль




        // knowing of numbers of elements, and add element by element from scanner

      Scanner input = new Scanner(System.in);
     //   String [] studentThree = new String[4]; // создали массив с размером 4
     //   System.out.println("Enter ID");// заполняем каждый индекс массива
        //studentThree[0] = input.next();
       // System.out.println("Enter first name");// заполняем каждый индекс массива
       // studentThree[1] = input.next();
      //  System.out.println("Enter last name");// заполняем каждый индекс массива
      //  studentThree[2] = input.next();
      //  System.out.println("Enter your batch");// заполняем каждый индекс массива
      //  studentThree[3] = input.next();
       // System.out.println(Arrays.toString(studentThree)); // возвращаем массив в консоль



// most dynamic way to create array

        String[] studentFour = new String[4];
        String[] question = {"id", "first name", "last name", "butch number"};// создали массив с окончаниями вопросов
        for(int i = 0; i < studentFour.length; i++){ // лууп который будет повторять одинаковую часть вопросов и давать вводить string
            System.out.println("Enter your " + question[i]);// соединяем постоянно повтояющуюся часть вопроса с индексами массива, в котором хранятся окончания вопросов, таким образом, при каждой итерации возникает новый вопрос(складывается вопрос из постоянной части и меняющейся части, хрянящейся в изначально созданном массиве со всеми известными элементами(окончаниями вопросов)
            studentFour[i] = input.next(); // добавляем в заранее определенный массив размером 4 введенные данные

        }
        System.out.println(Arrays.toString(studentFour)); // возвращаем массив в консоль



    }
}
