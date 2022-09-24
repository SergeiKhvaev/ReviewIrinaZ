package day44_abstraction_polimorphism2.employee;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

   public  void writeBugReport(){
        System.out.println("from Person");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
