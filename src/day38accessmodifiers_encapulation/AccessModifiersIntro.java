package day38accessmodifiers_encapulation;

public class AccessModifiersIntro {

    public int a = 5;
    int b = 10; // default access - default modifier, because we didnt difine other
    private int c = 20;

    public static void main(String[] args) {

        AccessModifiersIntro obj = new AccessModifiersIntro();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

    }



}
