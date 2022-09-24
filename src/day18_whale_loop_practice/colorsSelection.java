package day18_whale_loop_practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class colorsSelection {
    public static void main(String[] args) {

        int attempts = 0;
        Scanner input = new Scanner(System.in);
        Boolean green = true; // перед выполнением программы цвет доступен
        boolean red = true;// перед выполнением программы цвет доступен
        boolean yellow = true;// перед выполнением программы цвет доступен
        boolean black = true;// перед выполнением программы цвет доступен
        String colorChosen = "";// хуй его знает пока, но зачем-то


        while (attempts < 3) { // три полных цикла loop должно произойти
            System.out.println("Select  color, please"); // просим ввести цвет
           String color = input.next();

          if (green && color.equals("green")) { // при первом вводе if условие всегда верное, т.к. green boolean =true и и первый введенный цвет соответственно зеленый или красны или желтый или черный соответственно для каждого if. ввели green защли в if -> автоматически для этого if пишем, что выбран зеленый + green цвет делаем недоступным, т.е. false (этот if уже не будет работать при следующем введении цвета green, т.к. green уже false, а условие - green (т.е. должно быть true) && color.equals("green"). И в этом цже блоке If делаем loop минус одну итерацию, т.е. после рабатывания этой логики в каждом IF отнимается один цикл loop. И наоборот, если ни один IF не работает при вводе, это означает бесконечный лууп, пока не выберешь три разных цвета
                System.out.println("You took green");
                green = false;
                //colorChosen = color + "+";
                attempts = attempts + 1;
            }
           else if (red && color.equals("red")) {
                System.out.println("You took red");
              //  colorChosen = color + "+";
                red = false;
                attempts = attempts + 1;
            }
             else if (yellow && color.equals("yellow")) {
                    System.out.println("You took yellow");
                    //colorChosen = color + "+";
                    yellow = false;
                    attempts = attempts + 1;
                }
             else if (black && color.equals("black")) {
                    System.out.println("You took black");
                  //  colorChosen = color + "+";
                    black = false;
                    attempts = attempts + 1;
                    }

                    }
        System.out.println(colorChosen);
                }


            }


