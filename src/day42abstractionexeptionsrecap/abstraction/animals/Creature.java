package day42abstractionexeptionsrecap.abstraction.animals;

public abstract class Creature {
    String type;
    int age;
    char gender;

    public Creature(String type, int age, char gender){ // constructor with parameters
        this.type = type;
        this.age = age;
        this.gender = gender;
    }

    public abstract String eat();

    public String toString(){
    return "Creature type " + type + " age of creature - " + age + " creature gender " + gender;
    }

}
