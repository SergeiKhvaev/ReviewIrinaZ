package day14string;

public class stringMethodsPart2 {
    public static void main(String[] args) {


        String str4 = "Sergei Khvalev";
boolean starts = str4.startsWith("S");

        System.out.println(starts);
        boolean starts2 = str4.startsWith("Se");
        System.out.println(starts2);

        boolean starts3 = str4.startsWith("Str");
        System.out.println(starts3);

        System.out.println("--------------------------------");

        String str5 = "Sergei Khvalev ";

        System.out.println(str5.endsWith("ev"));





    }
}
