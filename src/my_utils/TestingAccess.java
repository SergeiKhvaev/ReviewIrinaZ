package my_utils;

import day38accessmodifiers_encapulation.AccessModifiersIntro; // import, because class we called here from another packege

public class TestingAccess {
    public static void main(String[] args) {

        AccessModifiersIntro obj = new AccessModifiersIntro();
        System.out.println(obj.a);
       // System.out.println(obj.b); // complain because c variable has dufault access modijier and we call that variable from another packege
     //   System.out.println(obj.c);// complain because c variable has privat access modijier and we call that variable from another class

    }

}
