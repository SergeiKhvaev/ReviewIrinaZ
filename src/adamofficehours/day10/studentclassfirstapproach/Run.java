package adamofficehours.day10.studentclassfirstapproach;

import java.util.ArrayList;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        ArrayList<Student> batch27 = new ArrayList<>();

        Student sergei = new Student("Sergei", 39, 'M', 1);
        Student katy = new Student("Katy", 36, 'F', 2);
        Student eva = new Student("Eva", 30, 'F', 3);
        Student anatotliy = new Student("Anatoliy", 45, 'M', 4);
        Student ethel = new Student("Ethel", 40, 'F', 5);
        Student lubava = new Student("Lubava", 39, 'F', 6);

        batch27.addAll(Arrays.asList (sergei, katy, eva, anatotliy, ethel, lubava)); // Arrays.asList need to use, because ArrayList operate only with collections

        System.out.println(batch27);
        System.out.println(batch27.size());
        System.out.println("===========================");

        //  get whole ArrayList

        System.out.println(StaticMethods.getAllStidents(batch27));

        System.out.println("==========================");
        // get student name which name with given char

        System.out.println(StaticMethods.getParticularName(batch27, 'S'));// only sergei

        System.out.println("========================");
//get students id is bigger then  (long id - given id)
        System.out.println(StaticMethods.idBiggerThenNum(batch27,4));

        System.out.println("============================");
        //- delete student with (long id - given id)
        System.out.println(StaticMethods.deleteByIdNum(batch27, 4));


        System.out.println("======================");
// delete student if name contains (char ch - given char)
        System.out.println(StaticMethods.deleteByCharInName(batch27,'E'));

        System.out.println("===================");

        batch27.addAll(Arrays.asList (eva, anatotliy, ethel)); // Arrays.asList need to use, because ArrayList operate only with collections
        System.out.println(batch27.size());

        // get by gender
        System.out.println(StaticMethods.getByGender(batch27,'F'));
        System.out.println(StaticMethods.getByGender(batch27,'M'));

        System.out.println("========================");
        // looping

        for(Student eachElement: batch27){
            if(eachElement.id <= 4){
                System.out.println(eachElement);
            }

        }



    }
}
