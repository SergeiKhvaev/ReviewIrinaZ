package adamofficehours.day10;

import static adamofficehours.day10.StaticIntro.num;

public class Run {
    public static void main(String[] args) {

        System.out.println("num " + num);// call static block, it works before everything num = 10 (we define static variable)

        StaticIntro obj = new StaticIntro(60); // call here constructor with parameter, num = 70 (we reassighn static variable 10 +60 = 70
        System.out.println("num " + num);


        StaticIntro obj2 = new StaticIntro(); // we called second constructor no parameter, we reassighn static variable again 60 + 15 = 85

        System.out.println("num " + num);

    }
}
