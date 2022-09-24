package day37staticvariablesandmethod.applephon;

public class Iphone {
    // instance variable
    String model;
    String color;
    double price;
    int storage;

    // static variables
    static String os;
    static String brand;

    static{// нам нужны статик вариаблес созданные, передо блоком, тогда мы к ним будем ибеть доступ в объектах. Статик блок будет запускаться вначале  созданного объекта (автоматически)и только один раз, перед всем другим кодом т.е. static block не нужно будет писать отдельно в каждом объекте
        System.out.println("static block run");
        os = "IOS";
        brand = "Apple";
    }


// constractor use to initialize instance variable
    public Iphone(String model, String color, double price, int storage) {
        System.out.println("CONSTRACTOR RUN");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }
    // static variable can be in constructor, bud not sholde be there

    /*
    разница между статик блоком и конструктором

    статик блок запустица один раз когда класс будет использован

    конструктор будет вызываться  каждый раз как объект будет создаваться

     */

    @Override
    public String toString() {// автоматически генерирует только instance variables, но мы можемдобавить туда static veriables вручную
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
