package day41exeptions.person;

public class Run  {
    public static void main(String[] args) {

        Person object = new Person();
        object.setName("Sergei");
        object.setAge(21);
        System.out.println(object);


        System.out.println("=============================");

        Person objec2 = new Person();
        objec2.setAge(-30); // our throw new IllegalArgumentException(); will works
        System.out.println(objec2);

    }
}
