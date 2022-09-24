package day41exeptions.person;

public class Person {

    private String name;
  private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int setAge() {

        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120){
            throw new IllegalArgumentException("Invalid ade" + age); // throw appropriate exception in case if block true// so program will stop by exception, user will get clear info about why program stops, otherwise need to handle Exception by catch block
        }

        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
