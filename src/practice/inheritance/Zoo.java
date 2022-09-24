package practice.inheritance;

public class Zoo {
    public static void main(String[] args) {

            Dog doggy = new Dog("Lucy", "Shapard", 'F', 5,
                    "Huge");
            doggy.bark();
            System.out.println(doggy);

            Cat cat = new Cat("Koda", "siam", 'M', 13, "Small");
            cat.moew();
            System.out.println(cat);

            Fish fish = new Fish("Shark", "Whate shark", 'M', 100, "Huge");
            fish.swim();
            System.out.println(fish);


        }

    }
