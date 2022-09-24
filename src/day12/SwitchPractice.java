package day12;

public class SwitchPractice {

    public static void main(String[] args) {

        String browser = "chrome";

        switch (browser){
            case "chrome":
                System.out.println("opening google in chrome");
                break;

            case "firefox":
                System.out.println("opening in farefox");
                break;
            case "safari":
                System.out.println("Special set up or apple computers");
                System.out.println("Opening in safari");
            default:
                System.out.println("Opening in chrome by default");
                break;}


        System.out.println("===================================");

        String item5 = "Sergei";

        String item2 = "Sergei1";

System.out.println(item5 == item2);



    }
}
