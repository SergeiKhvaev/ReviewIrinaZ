package day37staticvariablesandmethod.School;

public class District {
    public static void main(String[] args) {
        SchoolStaticMethod.district = 149;// static variable - доступ без создания объекта, посредством вывоза class name
        SchoolStaticMethod.totalTeachers = 100;// static variable - доступ без создания объекта,
        SchoolStaticMethod.totalStudents = 3000;// static variable - доступ без создания объекта,

        SchoolStaticMethod.totalTeachers--;
        System.out.println(SchoolStaticMethod.totalTeachers--);
        System.out.println(SchoolStaticMethod.district);
        System.out.println(SchoolStaticMethod.totalStudents);

        SchoolStaticMethod.announcement();//static method - доступ без создания объекта,
       // SchoolStaticMethod.lunch(); // this lunch metod is instance, so we need object

        SchoolStaticMethod middle = new SchoolStaticMethod();
        middle.lunchTime = 12;
     // SchoolStaticMethod.lunchTime; // we can call method because it by Class name need object
        middle.lunch();
        middle.totalStudents = 5000;// через обхект мы можем менять  static variable, но обычно доступ к static осуществляется через class name
        System.out.println(SchoolStaticMethod.totalStudents);






    }

}
