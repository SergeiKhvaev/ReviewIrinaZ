package day34ClassAndObjectsIntro.Monitor;

public class MonitorClass {
    double size;
    String brand;
    String color;
    boolean isTouchScreen;
    int pixels;
    char seria;

    public MonitorClass(double size, String brand, String color, boolean isTouchScreen, int pixels, char seria){
        this.size = size;
        this.brand = brand;
        this.color = color;
        this.pixels = pixels;
        this.isTouchScreen = isTouchScreen;
        this.seria = seria;

    }

    public String ColorPlusBrand(){
        return "General information about monitor - brand: " + brand + ", color: " + color + ", pixels: " + pixels;

    }

    public void seria (){
        System.out.println("Monitor seria is " + seria);
    }

    public String toString() {
        return "MonitorClass{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isTouchScreen=" + isTouchScreen +
                ", pixels=" + pixels +
                ", seria=" + seria +
                '}';
    }
}
