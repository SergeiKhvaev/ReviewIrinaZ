package scanner_Packadge;

import java.util.Scanner;// вызывает scanner class, по€вл€етс€ возможность вызывать методы ввода в консоль, где java.util - это специальный пакет java, а Scanner - это класс Scanner

public class ScannerPractice {

    public static void main(String[] args){

        Scanner answers = new Scanner(System.in); // создает сканнер, который который будет примен€ть методы к нашим объектам, где answer - это им€ переменной, через которое мы будем обращатьс€ к объ€вленным объектам и примен€ть необходимые методы, (System.in) - это параметр input, ....... теперь scanner соединен с нашей клваиатурой и мы можем примен€ть методы и контактировать через консоль в обе стороны


        // Ask the user to enter an integer number (объект1)

        System.out.println("Enter an integer number"); // отображаем сообщение, т.е. в консоле отразитс€ запрос на введение целочисленного значени€ (объект 1)

       int num1 = answers.nextInt(); // где answers - это название переменой, через которую мы обращаемс€ к объекту, а .nextInt -это название метода, который мы собираемс€ примен€ть, и если € хочу, что бы число было возможно использовать много раз, мне нужно его объ€вить как переменную int, т.е. int num1 =

        // Ask the user to enter a decimal number (объект 2)
        System.out.println("Enter a decimal number, please:");
    double num2 = answers.nextDouble(); // если € хочу что бы дробное число было возможно использовать много раз, следует его объ€вить как переменную double, т.е. (double =)

        // Ask the user to enter a word (объект 3)
       System.out.println("Enter a word, please");
     String wordOne =  answers.next(); // что бы сделать этот объект reusible можно его объ€вить переменной String, т.е. (String =)

        answers.nextLine(); // пуста€ строка необходима, что бы забрать Enter из пам€ти, следовательно иметь возможность продолжить применение метода nextLine()

        // Ask the user to enter full name
        System.out.println("Enter your full name, please: ");
       String fullName = answers.nextLine();

        // Ask user answer true or false (объект 4)
System.out.println("Is your eyes are blue: ");

boolean isGreenEyes = answers.nextBoolean();





        System.out.println("Number 1 = " + num1 + "\n" + "Number 2 = " + num2 + "\n" + "Name: " + wordOne+ "\n" + "Full name: " + fullName + "\n" + "Your eyes are green: " + isGreenEyes);





    }


}
