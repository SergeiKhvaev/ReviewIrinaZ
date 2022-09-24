package day35ClassAndObject.employee;

public class Amazon {
    public static void main(String[] args) {
        EmployeeClass employee1 = new EmployeeClass("Sergei Khvalev", "Lead SDET", 65, 121000);
        System.out.println(employee1);

        employee1.goToMeeting();

        System.out.println("=============================");

        EmployeeClass employee33 = new EmployeeClass("Ekaterina Starovoitova", "Full stack developer", 3, 325000);
        System.out.println(employee33);

        employee33.goToMeeting();


    }




}
