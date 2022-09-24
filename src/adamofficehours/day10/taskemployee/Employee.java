package adamofficehours.day10.taskemployee;

public class Employee {

    String name;
    long id;

    public Employee(String name, long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
