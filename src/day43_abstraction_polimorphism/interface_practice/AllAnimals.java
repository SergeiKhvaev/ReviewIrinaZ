package day43_abstraction_polimorphism.interface_practice;

public class AllAnimals {

}

class Cat extends Animal implements Freindly{

    //methods to implement


    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void pet() {

    }

    @Override
    public void play() {

    }
}

class Dog extends Animal implements Freindly, Swimable{

    //methods to implement


    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void pet() {

    }

    @Override
    public void play() {

    }

    @Override
    public void swimable() {

    }
}

class Tiger extends Animal implements Swimable{
// 2+1 methods to implement


    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void swimable() {

    }
}

class Shark extends Animal implements Swimable{
//2+1 methods to implement


    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void swimable() {

    }
}
class Bird extends Animal implements Flyable{
// 2+1 methods to implement


    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }
}

class Duck extends Animal implements Flyable, Swimable{
// 2+1+1 methods to implement


    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swimable() {

    }
}