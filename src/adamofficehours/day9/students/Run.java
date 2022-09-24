package adamofficehours.day9.students;

import java.time.LocalDate;

public class Run {
    public static void main(String[] args) {
        // how to create object
        CustomClass studentOne  = new CustomClass();
        studentOne.setInfo(45,"Sergei", 'M', LocalDate.of(1983, 10, 20), "cydeo"); // we did not put age here, but class code calculate it base on given information

        System.out.println(studentOne);

        System.out.println("====================");

        CustomClass studentTwo  = new CustomClass();
        studentTwo.setInfo(45,"Katy", 'F', LocalDate.of(1986, 1, 11), "cydeo");
        System.out.println(studentTwo);
        CustomClass.schoolName = "cydeo12"; // change static variables
        System.out.println(studentOne);// see school name will change in all objects because of static specifyer
        System.out.println(studentTwo);


    }


}
