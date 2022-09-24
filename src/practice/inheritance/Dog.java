package practice.inheritance;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, int age, String size) {
        super(name, breed, gender, age, size);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }


}
