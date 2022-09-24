package practice;

public class HW1 {
    public static void main(String[] args) {
        String task= "задача ";
        byte a = 10;
        byte b = 20;
System.out.println(task+1);
        System.out.println (a);
        System.out.println (b);
System.out.println("_______________________________________");

System.out.println(task+2);
int a1 = 3;
int a2 = 2;
int a3 = 1;
String a4 = ("Поехали!");

System.out.println(a1);
System.out.println(a2);
System.out.println(a3);
System.out.println(a4);
        System.out.println("_______________________________________");

        System.out.println(task+3);
        String a5= "Butterfly";
        System.out.println(a5);
        System.out.println("_____________________________");
        System.out.println(task+4);

int a6 = 5;
int a7 = 4;

System.out.println(a6+a7);
System.out.println(a6*a7);
System.out.println(a6-a7);
System.out.println(a6/a7);
System.out.println(a6%a7);

double a8 = 5;
double a9 = 3;

System.out.println(a8/a9);
System.out.println("___________________________________________");

System.out.println(task+5);
int a10 = 5;
int a11 = 8;
System.out.println("a10 is even "+(0==5%2));
System.out.println("a11 is even "+(0==8%2));

System.out.println("__________________________________________");
System.out.println(task+6);

short a12 = 200;
long a13 = 2000000000;

System.out.println(a12);
System.out.println(a13);

short a14 = 201;
short a15 = a14;

System.out.println(a15);

long a16 = 15713442736L;
System.out.println(a16);

String a17 = "+1";
int a18 = 571;
long a19 = 344_2736;

System.out.println(a17+" "+a18+" "+a19);



System.out.println("____________________________");

System.out.println(task+7);

float a21 = 100.1001F;
System.out.println(a21);

System.out.println("_____________________________");

System.out.println(task+8);

double a22 = 1000.011111111;
System.out.println(a22);

String myNameInSlack = "Sergei";
System.out.println("myNameInSlack");
System.out.println("___________________________________________");

    System.out.println(task+9);

    int a23 = 33;
    int a24 = 45;

    int sum = a23 + a24;
    System.out.println(sum);

    byte a25 = 37;
    byte a26 = 55;

    int sum1 = a25 * a26;
    System.out.println(sum1);

    System.out.println("______________________________");

    System.out.println(task+10);



    long a27 = 15786;
    long a28 = 1293;

    long product = a27*a28;
    System.out.println(product);

    short a29 = 100;
    short a30 = 100;

    int a31 = a29+a30;
    System.out.println(a31);

    System.out.println("___________________________________");

    System.out.println(task+11);

    int a32 = 500;
    int a33 = 50;

    int quot = a32/a33;
    System.out.println(quot);

    System.out.println("___________________________________________");

    System.out.println(task+12);

    String b1 = "product";

    int a35 = a32+a33;

    System.out.println(b1+" ="+" "+a35);

    System.out.println("____________________________________");

    System.out.println(task+13);

    float a36 = 100.10001F;
    int a37 = 100;

    float product2 = a36/a37;

    System.out.println(product2);


        float reminder = a36%a37;

        System.out.println("reminder " + "= "+ reminder);

        System.out.println("_________________________________________");

        System.out.println("task+14");

        double a38 = 55;
        double a39 = 32;

        int sum2 = (int)a38 + (int)a39;

        System.out.println("sum2 " + "= " + sum2);

        System.out.println("______________________________________");

        System.out.println(task+15);

        System.out.println( "::     ::  :::::::  ::        ::       :::::::::\n"+
                            "::     ::  ::       ::        ::       ::     ::\n"+
                            ":::::::::  :::::::  ::        ::       ::     ::\n"+
                            "::     ::  ::       ::        ::       ::     ::\n"+
                            "::     ::  :::::::  ::::::::  :::::::  ::::::::: ");

System.out.println("\n+"+"\n+");

        String a40 = ("::     ::  :::::::  ::        ::       :::::::::\n"+
                      "::     ::  ::       ::        ::       ::     ::\n"+
                      ":::::::::  :::::::  ::        ::       ::     :: ");
        String a41 = ("::     ::  ::       ::        ::       ::     ::\n"+
                      "::     ::  :::::::  ::::::::  :::::::  :::::::::");
System.out.println(a40+"\n"+a41);

System.out.println("______________________________________");

System.out.println("task+16");

// Если человек родился 1983 году, то в ?? году ему исполнилось ?? лет


int birth = 1983;
int currentYear = 2022;
//int x = birth-currentYear;
String text1 = ("Если человек родился ");
String text2 = (" году, то в ");
String text3 = (" году ему исполнилось ");
String text4 = (" лет");

currentYear = 2000;
birth = 1980;

System.out.println(text1+birth+text2+currentYear+text3+(currentYear-birth)+text4);

System.out.println("______________________________________________");

System.out.println(task+17);














    }
}
