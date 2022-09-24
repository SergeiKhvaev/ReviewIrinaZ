package SergeiPractice;

public class SergeiClass {
    public static void main(String[] args) {

        String a = ("__________________");
        String task = ("Задание ");

        System.out.println(a);
        System.out.println(task + 1);

        String имя = (" Сергей");
        String Фамилия = ("Хвалёв");
        String курсОбучения = (" Java ");
        int возраст = 38;

        System.out.println("Я студент " + Фамилия + имя + ", " + "я учусь на курсе" + курсОбучения + "и мне " + возраст + " лет.");

        System.out.println(a);
        System.out.println(task + 2);

        Float b = 3.5f;
        System.out.println(b * b);

        Double c = 3.5;
        Double d = 3.5;

        System.out.println(c * d);

        Double e = 3.5;
        Double result = e * e;
        System.out.println(result);

        int course;
        int age;
        course = 5;
        age = 38;

        System.out.println(a);
        System.out.println(task + 3);

        String name = ("Vasye");
        int age1 = 102;
        int iQ = age1;

        System.out.println(name + " " + age1 + " годика" + ", его IQ " + iQ);

        System.out.println(a);
        System.out.println(task + 4);


        int x1 = 10;
        int x2 = 25;

        if (x1 == x2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        int x3 = 19;
        int x4 = 19;

        if (x3 == x4) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(a);
        System.out.println(task + 5);

        int x5 = 24;
        int x6 = 54;
        if (x5 == x6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int x7 = 55;
        int x8 = 55;
        if (x7 == x8) {
            System.out.println("x7==x8");
        } else {
            System.out.println("false");
        }

        int x9 = 59;
        int x10 = 67;
        if (x9 != x10) {
            System.out.println("true");
        } else {
            System.out.println(x9 != x10);
        }

        System.out.println(a);
        System.out.println(task + 6);


        int x11 = 15;
        int x12 = 19;
        if (x11 < x12) {
            System.out.println("x11<x12");
        } else {
            System.out.println("no");
        }

        int x13 = 29;
        int x14 = 28;
        if (x13 < x14) {
            System.out.println("x13<x14");
        } else {
            System.out.println("false");
        }
        int x15 = 79;
        int x16 = 63;
        if (x15 > x16) {
            System.out.println("x15>x16");
        } else {
            System.out.println(false);
        }


        System.out.println(a);
        System.out.println(task + 7);

        int x17 = 78;
        int x18 = 95;
        if ((x17 + x18) % 2 == 0) {
            System.out.println("maybe x17 and x18 are even");
        } else {
            System.out.println(false);
        }

        int x19 = 88;
        int x20 = 90;
        if ((x19 + x20) % 2 == 0) {
            System.out.println("maybe x17 and x18 are even");
        } else {
            System.out.println(false);
        }

        int x21 = 68;
        int x22 = 89;
        if ((x21 + x22) % 2 == 1) {
            System.out.println("some variable is odd");
        } else {
            System.out.println("both variables are even");
        }

        System.out.println(a);
        System.out.println(task + 8);

        int x23 = 60;
        if (x23 > 10) {
            System.out.println("больше 10");
        }

        int x24 = 60;
        if (x24 < 100) {
            System.out.println("меньше 100");
        }

        int x25 = 33;
        if ((x25 / 2) > 20) {
            System.out.println("результат деления на 2 больше 20");
        } else {
            System.out.println(false);
        }

        int x26 = 40;
        if ((x26 / 2) > 20) {
            System.out.println("результат деления на 2 больше 20");
        } else {
            System.out.println("false");
        }
        int x27 = 40;
        if ((x27 / 2) >= 20) {
            System.out.println("результат деления на 2 больше 20");
        } else {
            System.out.println(false);
        }

        int x28 = 78;
        if (x28 > 5 && x28 <= 40) {
            System.out.println("значение пересенной между 5 и 40 включительно");
        } else {
            System.out.println(false);
        }


        int x29 = 45;
        if (x29 > 5 && x29 <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println(false);
        }


        int x30 = 45;
        if (x30 > 5 && x29 < 40) {
            System.out.println("значение переменной между 5 и 40 влючительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }


        System.out.println(a);
        System.out.println(task + 9);

        int x31 = 9;
        int x32 = 6;
        int x33 = 12;
        if (x31 > x32 && x31 > x33) {
            System.out.println(x31);
        }
        if (x32 > x31 && x32 > x33) {
            System.out.println(x32);
        }
        if (x33 > x31 && x33 > x32) {
            System.out.println(x33);
        } else {
            System.out.println("False");
        }
///// более простоя варианта решения задачи на определение самого большого числа
        if (x31 > x32 && x31 > x33) {
            System.out.println(x31);
        } else {
            if (x32 > x33) {
                System.out.println(x32);
            } else {
                System.out.println(x33);
            }
        }
        System.out.println(a);
        System.out.println(task + 10);

        int x34 = 24;
        int x35 = 2500;
        int x36 = 109;
        int x37 = 1015;

        if (x34 > x35 && x34 > x36 && x34 > x37) {
            System.out.println(x34);
        } else {
            if (x35 > x36 && x35 > x37) {
                System.out.println(x35);
            } else {
                if (x36 > x37) {
                    System.out.println(x36);
                } else {
                    System.out.println(x37);
                }
            }
        }
        System.out.println(a);
        System.out.println(task + 11);

        int x38 = -105;
// positive or negative on == 0

        if (x38 >= 1) {
            System.out.println("positive");
        } else {
            if (x38 == 0) {
                System.out.println("equel 0");
            } else {
                if (x38 <= -1) {
                    System.out.println("negative");
                }
            }
        }
// иное решение задачи

        if (x38 > 0) {
            System.out.println("positive");
        } else {
            if (x38 < 0) {
                System.out.println("negative");
            } else {
                System.out.println("equal 0");
            }
        }


        System.out.println(a);
        System.out.println(task + 12);

        int x39 = 140;
        // проверить четное или нечетное число

        if (x39 % 2 == 0) {
            System.out.println("x39 is even");
        } else {
            System.out.println("x39 is odd");
        }

        System.out.println(a);
        System.out.println(task + 13);

        int x40 = 9;
        // проверть делится ли переменная на 3 без остатка

        if (x40 % 3 == 0) {
            System.out.println(true);
        } else {
            System.out.println("False");
        }

        System.out.println(a);
        System.out.println(task + 13);

        int x41 = 2022;
        // определить является ли текущий год высокосным

        if (x41 % 4 == 0) {
            System.out.println("2022 год является высокосным");
        } else {
            System.out.println("2022 год не являктся высокосным");
        }

        System.out.println(a);
        System.out.println(task + 14);

        String x = "Г";
        // выяснить букв а Г гласная или согласная???


        // проверить символ Д является циврой или буквой???


        System.out.println(a);
        System.out.println(task + 15);

//LOOP

        for (int a13 = 12; a13 < 15; a13 = a13 + 1) {
            System.out.println(a13);
        }
        System.out.println("Hi");

        for (float a13 = 12; a13 <= 15; a13 = a13 + 0.5F) {
            System.out.println(a13);
        }

        for (int a13 = 3; a13 < 100; a13 = a13 * 3) {
            System.out.println(a13);
        }
        System.out.println("END");


        int a13 = 5;
        for (; a13 < 12; a13 = a13 + 2) {
            System.out.println(a13);
        }
        if (a13 % 2 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println(false);
        }

        System.out.println(a);

        int a12 = 3;
        while (a12 < 11) {
            a12 = a12 + 2;
            System.out.println(a12);
        }

        System.out.println(a);
        int a14 = 20;
        while (a14 % 2 == 0) {
            System.out.println(a14);
            a14 = a14 - 3;
            System.out.println("end");
        }

        System.out.println(a);

        int b17 = 20;
        while (b17 % 2 == 0) {
            System.out.println(b17);
            b17 = b17 - 3;
            System.out.println(b17);
        }


        System.out.println(a);


        for (int a15 = 20; a15 % 2 == 0; a15 = a15 - 3) {
            System.out.println(a15);
        }
        System.out.println("Hey");

System.out.println(a);

        for(int a43 = 27; a43 >21; a43 = a43 - 1){
            System.out.println(a43);}
            System.out.println("Hi");

        System.out.println(a);

        System.out.println("Hello World!");

        int mark = 78;
        System.out.println("DONE");
        if(mark >= 50){
            System.out.println("PASS");}
        else{
                System.out.println("FAIL");

        }
System.out.println(a);
        System.out.println(task+18);

        int a18 = -1;
        System.out.println("bye");
        if(a18 % 2 == 1){
            System.out.println("Number is odd");}
            else{
                System.out.println("Number is even");
        }

            System.out.println(a);
            System.out.println(task+19);

            int a20 = 2;
            if(a20 == 1){
                System.out.println("ONE");}

                    if (a20 == 2) {
                    System.out.println("TWO");
                }

                    if (a20 == 3){
                        System.out.println("THREE");
                    }
                    else {System.out.println("FALSE");}
                    if (a20 == 4){
                        System.out.println("FOUR");
                    }
                     if(a20 == 5){
                        System.out.println("FIVE");
                    }
                    if(a20 == 6) {
                        System.out.println("SIX");
                    }
                    if(a20 == 7) {
                        System.out.println("SEVEN");
                    }
                    if(a20 == 8) {
                        System.out.println("EIGHT");
                    }
                    if (a20 == 9) {
                        System.out.println("NINE");
                    }
                    if (a20 == 10) {
                        System.out.println("TEN");}


                    System.out.println("-----------------------------------");


     for(int n25 = 1; n25 <=1; n25 = n25 +1){
       System.out.println("ONE");}
          int n27 = 7;
     if(n27 == 2){
        System.out.println("TWO");}
     else {System.out.println("NO");}
      if(n27 ==3){
         System.out.println("THREE");}
      else {System.out.println("NO");}
      if(n27 == 4){
         System.out.println("FOUR");}
      else {System.out.println("NO");}
      if(n27 == 5){
         System.out.println("FIVE");}
      else{System.out.println("NO");}
      if(n27 == 6){
         System.out.println("SIX");}
      else {System.out.println("NO");}
      if(n27 == 7){
         System.out.println("SEVEN");}
      else{System.out.println("NO");}
         if(n27 == 8){
            System.out.println("EIGHT");}
         else{System.out.println("NO");}
         if(n27 == 9){
            System.out.println("NINE");}
         else{System.out.println("NO");}
         if(n27 == 10){
            System.out.println("TEN");}
         else{System.out.println("NO");}


         System.out.println("-----------------------------");

         if (25>24){
             System.out.println("TRUE");}
         else{
             System.out.println("FALSE");}


















        }

     }
















































































