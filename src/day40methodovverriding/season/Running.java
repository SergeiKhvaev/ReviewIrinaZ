package day40methodovverriding.season;

public class Running {
    public static void main(String[] args) {

        Winter winterOne = new Winter(22, 55, 1000);
        System.out.println(winterOne);
        System.out.println(winterOne.name);
        System.out.println(winterOne.amountOfSnow);
        System.out.println(winterOne.activity());

        System.out.println("======================");
        Summer summerOne = new Summer(99, 76, 55);
        System.out.println(summerOne);
        System.out.println(summerOne.activity());
        System.out.println(summerOne.name);
        summerOne.name = "NotSummer";
        System.out.println(summerOne.name);
        System.out.println(summerOne.flowersBunch);
       // summerOne.flowersBunch  = 105; // can not reassign because that variable is final

        System.out.println("======================");
Spring springOne = new Spring(35, 56, 555);
        System.out.println(springOne);
        System.out.println(springOne.activity());
        System.out.println(springOne.name);
        System.out.println(springOne.greenGrass);

        System.out.println("=========================");
        Fall autumn = new Fall(67, 78, 100_000);
        System.out.println(autumn);
        System.out.println(autumn.activity());
        System.out.println(autumn.name);
        System.out.println(autumn.numOfYellowLeafs);



    }
}
