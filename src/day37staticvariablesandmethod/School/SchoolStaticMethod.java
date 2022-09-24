package day37staticvariablesandmethod.School;

public class SchoolStaticMethod {

public int lunchTime;
     static int district;
     static int totalTeachers;
     static int totalStudents;

    public static void announcement(){
        System.out.println("announcment to whole district");
    }

    public void lunch(){
        System.out.println("lunch is at " + lunchTime);
    }




}
