package adamofficehours.day10.studentsclasssecondapproch;

public class Run {
    public static void main(String[] args) {

        DataBaseOfStudents classDataBase = new DataBaseOfStudents();
        System.out.println(classDataBase.getAllPersons());

        System.out.println("===================");
// get students id is bigger then  (long id - given id)
        System.out.println(classDataBase.deleteById(DataBaseOfStudents.batch26, 3));

        System.out.println("=============");
        //- get students name, which contains - (char ch - given char)
        System.out.println(classDataBase.getParticularName(DataBaseOfStudents.batch26, 'a'));

        System.out.println("=============");
        // get students id is bigger then  (long id - given id)
        System.out.println(classDataBase.getStudentsById(DataBaseOfStudents.batch26, 2));

        System.out.println("=============");

        System.out.println(classDataBase.deleteByNameLonger(DataBaseOfStudents.batch26, 5));

        System.out.println("=================");
        System.out.println(classDataBase.deleteByNameLonger(4));





    }
}
