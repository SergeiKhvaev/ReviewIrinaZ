package day40methodovverriding;

import java.util.function.ToDoubleBiFunction;

public class toUnderstan {
    public static String name;

    static{
        System.out.println("static");
        name = "heyo";
        //System.out.println(name);
    }


    public static void main(String[] args) {
        toUnderstan first = new toUnderstan();
      first.name ="yoyo";

        toUnderstan second = new toUnderstan();
    //    second.name = "nono";

        toUnderstan third = new toUnderstan();

        System.out.println(third.name);
    }
}
