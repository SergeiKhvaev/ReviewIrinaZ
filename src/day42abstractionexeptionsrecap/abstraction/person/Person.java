package day42abstractionexeptionsrecap.abstraction.person;

public abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sleep(int hours);// hours we person sleep

    @Override
    public String toString(){
        return name +" " + age;
    }


}


