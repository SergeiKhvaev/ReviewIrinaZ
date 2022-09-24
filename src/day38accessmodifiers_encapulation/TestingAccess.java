package day38accessmodifiers_encapulation;

public class TestingAccess {

    public static void main(String[] args) {

        AccessModifiersIntro obj = new AccessModifiersIntro();
        System.out.println(obj.a);
        System.out.println(obj.b);
       // System.out.println(obj.c);// complain because c variable has privat access modijier and we call that variable from another class



    }

}
