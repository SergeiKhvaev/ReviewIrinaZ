package day28javamethods;

public class ReturnMEthodVSVoidMethod {



    public static void sayHallo (){
        System.out.println("Hello");
    }



    public static String sayBay (){
        return "Bye";


    }



    public static void main(String[] args) {
        sayHallo();
        sayBay(); // нет ничего, т.к. мы ничего не сделали с возвращенной величиной, поэтому в консоле пустое место
        System.out.println(sayBay()); // распечатает как строку, но распечатанную строку мы не можем использовать заново!!!
        String str = sayBay(); //метод вернет стринг и ассайн это в новый стринг

    }

}
