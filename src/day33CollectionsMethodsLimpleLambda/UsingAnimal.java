package day33CollectionsMethodsLimpleLambda;

public class UsingAnimal {
    public static void main(String[] args) {

        // создали объект из созданного ранее класса, дали характеристики объекта
        ClassAndObjectsIntroAnimal animal1 = new  ClassAndObjectsIntroAnimal();
        animal1.species = "Lions";
        animal1.numberOfLegs = 4;
        animal1.age = 15;
        animal1.canFly = false;
        animal1.weight = 200;
        System.out.println(animal1.species);
        System.out.println(animal1.numberOfLegs);
        System.out.println(animal1.canFly);
        System.out.println(animal1.age);
        System.out.println(animal1.weight);

        ClassAndObjectsIntroAnimal animal2 = new ClassAndObjectsIntroAnimal();
        System.out.println(animal2.species);// null, because we didnt assign value to object animal2
        // создаем новый объект из созданного ранного класса

    }
}
