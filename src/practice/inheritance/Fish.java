package practice.inheritance;

public class Fish extends Animal  {


    public Fish(String name, String breed, char gender, int age, String size) {
        super(name, breed, gender, age, size);
    }

    public void swim(){
        System.out.println(name + " is swimming");
    }
}
