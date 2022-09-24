package day34ClassAndObjectsIntro.app;

public class AppStore {
    public static void main(String[] args) {

        App maps = new App();
        maps.name = "Road maps";
        maps.version = 1.2;
        maps.isFree = true;
        maps.rating = 5;
        maps.update();// (we not use static - this key word we use to call method by calling particular class) instance method, we call that method through object// calling the instance method by reference as well
        System.out.println( maps.name);
        System.out.println( maps.version); // версия увеличилась, т.к. до этого мы вызвали созданный ранее метод - update()
        System.out.println(maps.isFree);
        System.out.println(maps.rating );
        System.out.println(maps.version);

        System.out.println(maps);// if we want to print object we will gethashcode, but we can call special method? what we create in class? where we can define how object will be print (public String toString(){return "Name: " + name + "\nVersion : "+ version+"\nisFree: " + isFree +"\nRating :" + rating;

        System.out.println(maps.toString());// this is not nessesary because toString is automaticali called
    }


    }

