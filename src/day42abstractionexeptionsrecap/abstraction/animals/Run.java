package day42abstractionexeptionsrecap.abstraction.animals;

public class Run {
    public static void main(String[] args) {

        Tiger sergei = new Tiger(20, 'M', "Striped");
        System.out.println(sergei);
        System.out.println(sergei.eat());
        System.out.println(sergei.drinkMilk(5));

    }


}
