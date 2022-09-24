package day35ClassAndObject.carper;

public class CarpetClass {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public CarpetClass(double inputWidth, double inputLength, double inputunitPrice, boolean inputPersian){
        width = inputWidth;
        length = inputLength;
        unitPrice = inputunitPrice;
        isPersian = inputPersian;
        calculatePrice();

    }

    public void calculatePrice(){
        totalPrice = width * length * unitPrice;
        if (isPersian){
            totalPrice = totalPrice * 1.5;
        }

    }


    public String toString() {
        return "CarpetClass{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice= $" + totalPrice +
                '}';
    }
}
