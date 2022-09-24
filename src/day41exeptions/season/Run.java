package day41exeptions.season;

public class Run {
    public static void main(String[] args) {
        Winter winterOne = new Winter(55, 25);
        System.out.println(winterOne);
        winterOne.activity();

        System.out.println("===============================");

        Summer summerOne = new Summer(99,87);
        System.out.println(summerOne);
        summerOne.activity();

    }
}
