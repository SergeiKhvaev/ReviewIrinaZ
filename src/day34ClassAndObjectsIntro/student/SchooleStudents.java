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
//Student.study(); не могу так вызвать объект, т.к. такой способ выpова работакт для static methods
        studentOne.study();// теперь мы используем instance methods, т.е. это означает что мы имеем доступ к методу не через класс(как ранее), а черед объект(конкретный объект - instance method)

        System.out.println("=====================");

        // мы создали еще один обхект, с новыми со свежими inctance variables, и в этом случае ини имеют default values? потому что мы их не определили
        Student studentTwo = new Student();
        System.out.println(studentTwo.name);
        System.out.println(studentTwo.batchNumber);
        System.out.println(studentTwo.program);
        System.out.println(studentTwo.grade);
        // call the inctance method
        studentTwo.study();


    }
}
