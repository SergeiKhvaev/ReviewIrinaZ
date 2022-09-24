package adamofficehours.day10;

public class StaticIntro {
    /*

    why we need to use static:
    - static block - to run once before every thing (
    - static variable
    we need it? we can initilaze static variables and we can use same variable for each code, method...
    -


     */

    public static int num;

    static {
        System.out.println("static block");
        num = 10;
    }

    public StaticIntro (){
        num += 15;
    }


    public StaticIntro (int add){
        num += add;
    }
}
