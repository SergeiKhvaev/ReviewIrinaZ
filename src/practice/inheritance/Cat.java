package practice.inheritance;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size){
        super(name, breed, gender, age, size);

    }

    public void moew(){
        System.out.println(name + " is moewing");
    }


}
