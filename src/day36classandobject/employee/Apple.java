package day36classandobject.employee;

public class Apple {
    public static void main(String[] args) {
        Employee workerOne = new Employee("Anatoliy Gusev", 123, "COE", 165000);

        workerOne.meeting();
        System.out.println(workerOne);


        Employee workerTwo = new Employee("Sergei Khvalev");
        System.out.println(workerTwo);

        Employee workerThree = new Employee("Ekaterina Starovoitova", 124);
        System.out.println(workerThree);

        Employee workerFour = new Employee("Sergei Khvalev", 4, "CEO");
        System.out.println(workerFour);

    }




}
