package day34ClassAndObjectsIntro.student;

public class SchooleStudents {
    public static void main(String[] args) {
        // we instatiated the class ClassAndObjectIntroStudent and we hhave access to variabled
        Student studentOne = new Student();

        System.out.println(studentOne);
        studentOne.name ="Olena";
        studentOne.batchNumber = 27;
        studentOne.program = "SDAT";
        studentOne.grade =99;
        System.out.println(studentOne);// not show anything
        System.out.println(studentOne.name);
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);

        // call the inctance method
//Student.study(); �� ���� ��� ������� ������, �.�. ����� ������ ��p��� �������� ��� static methods
        studentOne.study();// ������ �� ���������� instance methods, �.�. ��� �������� ��� �� ����� ������ � ������ �� ����� �����(��� �����), � ����� ������(���������� ������ - instance method)

        System.out.println("=====================");

        // �� ������� ��� ���� ������, � ������ �� ������� inctance variables, � � ���� ������ ��� ����� default values? ������ ��� �� �� �� ����������
        Student studentTwo = new Student();
        System.out.println(studentTwo.name);
        System.out.println(studentTwo.batchNumber);
        System.out.println(studentTwo.program);
        System.out.println(studentTwo.grade);
        // call the inctance method
        studentTwo.study();


    }
}
