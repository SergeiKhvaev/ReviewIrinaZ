package day44_abstraction_polimorphism2.clothes;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Wearing jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on jacket hood");
    }
}
