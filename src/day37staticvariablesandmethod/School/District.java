package day37staticvariablesandmethod.School;

public class District {
    public static void main(String[] args) {
        SchoolStaticMethod.district = 149;// static variable - ������ ��� �������� �������, ����������� ������ class name
        SchoolStaticMethod.totalTeachers = 100;// static variable - ������ ��� �������� �������,
        SchoolStaticMethod.totalStudents = 3000;// static variable - ������ ��� �������� �������,

        SchoolStaticMethod.totalTeachers--;
        System.out.println(SchoolStaticMethod.totalTeachers--);
        System.out.println(SchoolStaticMethod.district);
        System.out.println(SchoolStaticMethod.totalStudents);

        SchoolStaticMethod.announcement();//static method - ������ ��� �������� �������,
       // SchoolStaticMethod.lunch(); // this lunch metod is instance, so we need object

        SchoolStaticMethod middle = new SchoolStaticMethod();
        middle.lunchTime = 12;
     // SchoolStaticMethod.lunchTime; // we can call method because it by Class name need object
        middle.lunch();
        middle.totalStudents = 5000;// ����� ������ �� ����� ������  static variable, �� ������ ������ � static �������������� ����� class name
        System.out.println(SchoolStaticMethod.totalStudents);






    }

}
