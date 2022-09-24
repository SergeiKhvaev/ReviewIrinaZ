package day27ArraysMEthods;

public class FirstJavaMethod {


// мы создаем метод отдельно,  метод не можут быть создан внутри другого метода, но мы можем поместить в создаваемый метод, метод который уже существует. Мы можем создавать любой метод без main method, но если мы хотим исполнить метод, то по общему правилу нужно вызвать main method!!!!!!

    public static void HelloWorld(){// we decleare method
        System.out.println("Hello World!");
    }

    public static void HelloWorld5Times(){//created method which call "Hello World!" 5 times
        for(int i = 0; i < 5 ; i++){
            System.out.println("Hello World!");
        }

    }





    public static void main(String[] args) {// we need main method to run any code

        HelloWorld();// we called method
        HelloWorld();// we called method


        System.out.println("-----------------------------");

        for(int i = 0; i < 5 ; i++){//call method 5 times
            HelloWorld();
        }

        System.out.println("================================");

HelloWorld5Times();// called  method
HelloWorld5Times();// called  method

    }
}
