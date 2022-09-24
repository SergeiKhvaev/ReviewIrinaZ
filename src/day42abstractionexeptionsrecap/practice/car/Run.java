package day42abstractionexeptionsrecap.practice.car;

public class Run {
    public static void main(String[] args) {
        Toyota LC300 = new Toyota();
        LC300.start();

        System.out.println("=========================");

        BMW X7 = new BMW();
        X7.start();

        System.out.println("==========================");
        Tesla modelS = new Tesla();

        modelS.start();
        modelS.charge();

    }
}
