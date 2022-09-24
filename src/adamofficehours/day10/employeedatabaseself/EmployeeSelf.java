package adamofficehours.day10.employeedatabaseself;

public class EmployeeSelf { // �������� �����, ������� ����� ������ ����������� ��������� non primitive data type - object, whitch will collect summory of info about employee

    String name;
    int age;
    long id;

    public EmployeeSelf(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeSelf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
