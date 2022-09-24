package day26MultiDemenArray;

import java.util.Arrays;

public class groupCreation {
    public static void main(String[] args) {

// примеры способов создания многоуровненыых массивом

        char[] upper = {'R', 'j', 'A',};
        char[] lower = {'p' , 'z', 'q', 'd'};
        char[] other = {'4', '*', '#', '$', '@'};

        char[][] chars = new char[3][];// {upper, lower, other} - можно сделать и так. [] № 2 там мы можем указать размер массивом
        chars[0] = upper; // назначила хранить в первом уровне первый сингла массив
        chars[1] = lower;// назначила хранить во втором уровне второй сингла массив
        chars[2] = other;// назначила хранить в третьем уровне третий сингла массив
        System.out.println(Arrays.toString(chars[0]));// распечатали каждый уровень отдельно
        System.out.println(Arrays.toString(chars[1]));// распечатали каждый уровень отдельно
        System.out.println(Arrays.toString(chars[2]));// распечатали каждый уровень отдельно

        System.out.println(Arrays.deepToString(chars)); // Этот метод используется для распечатки многоуровнегового массива

        System.out.println("====================================================");
        //

        String [][] cydeo = {
                {"Alen", "tina", "Alina", "NArgiza"},
                {"Sergei", "Ekaterina", "Eva", "Adam"},
                {"Etel", "Anatoliy", "Lubava"},
                {"Kety", "Olia", "Zarub", "Coba", "Toto"}

                 };

        System.out.println(cydeo.length);// длинна многоуровнего массива -4, т.к. 4 элемента(4 простых массива) внутри
        System.out.println(cydeo[2].length); // длинна второго массива - 3
        System.out.println(cydeo[0][3]); // просим вывести первого массива 3 индекс - NArgiza
        System.out.println(Arrays.toString(cydeo[1])); // печатаем массив под индексом 1 - {"Sergei", "Ekaterina", "Eva", "Adam"},
        System.out.println(Arrays.deepToString(cydeo)); // распечатываем многоуровневый массив полностью


        // how to loop through each inner array

        for(String [] eachInner : cydeo){
            System.out.println(Arrays.toString(eachInner));

        }
            System.out.println("===========================");
            // how to loop through each name each array

            for(String[] eachInner : cydeo){
                for(String eachName : eachInner){
                    System.out.println(eachName);

                }

            }

        System.out.println("===========================");
        // how to loop through each name each array and print last letter in upper case

        for(String[] eachInner : cydeo){
            for(String eachName : eachInner){
                System.out.println(eachName.substring(eachName.length()-1).toUpperCase());

            }

        }

    }
}
