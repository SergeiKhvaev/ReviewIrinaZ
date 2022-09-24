package day41exeptions.hidding;

public class Person {

    String name = "Sergei Khvalev";

}

class SecretIdentity extends Person {

    String name = "James Bond"; // we did variable hiding, original was hidden? but now I have new variable with same name

}

class Runner {
    public static void main(String[] args) {
        // я могу создаь нормальный объект затем получить доступ к переменный - да, но я могу быстро стоздать объект, без референс на него

        // имя какого класса вызывать зависит от референс какого класса использовать в коде

        System.out.println(new Person().name); // which variable we will call depend from reference on what class we will use to call variable
        System.out.println(new SecretIdentity().name);// which variable we will call depend from reference on what class we will use to call variable



    }

}
