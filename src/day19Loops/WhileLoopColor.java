package day19Loops;
import java.util.Scanner;
public class WhileLoopColor {

    public static void main(String[] args) {
        // select three different colors// цикл должен работать пока не будут введены три РАЗНЫХ цвета
        Scanner input = new Scanner(System.in);

        int numberOfColors = 0;// число верно выбранных цветов будет расти, определили что бы задать условие в цикле
        String colors = ""; // определили, что бы была возможность переназначать цвет, а также что бы что бы вывести сообщение в конце цикла


        while(numberOfColors < 3) {
            System.out.println("Enter the next color");
            String inputColor = input.nextLine(); // ввод цвета

            if (!colors.contains(inputColor)) { // if , true и будет работать пока вводимый цвет будет уникальным или иными словами введенный цвет не будет  содеражть уже введенный цвет, при этом любой введенный цвет автоматически уникален, за тем работает логика
                colors += " " + inputColor; // сюда бы переназначаем новый цвет, что бы проверять if стайтмент, что мы делаем через String method.contains, также будет использоваться для  отражения  трех разных введенных цветов первый цвет + второй цвет + третий цвет.
                numberOfColors++;// увеличение числа попыток, при этом увеличение числа попыток происходит после прохождения исполнение внутрь if statmenta, если IF не начинает испоняться, то цикл идет бесконечное количство раз.
        }
        }

        System.out.println(colors);

        }













}


