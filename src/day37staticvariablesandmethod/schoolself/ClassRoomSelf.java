package day37staticvariablesandmethod.schoolself;

import day35ClassAndObject.school.Cydeo;

public class ClassRoomSelf {
    public static void main(String[] args) {
// because we have static block in class with  print statment, which call all static variables, that whay we have first line in consol, that line appeare automatically


        //System.out.println(CydeoSchool.instructors);// called static variables without crating object
      //  System.out.println(CydeoSchool.school);// called static variables without crating object
      //  System.out.println(CydeoSchool.butchNum);// called static variables without crating object

        CydeoSchool.SchoolInfo();// called static method without creating object

        CydeoSchool sergei = new CydeoSchool ("Sergei", 'F', 39, 26); // created object sergei

        System.out.println(sergei);
        sergei.goToMeting();
        System.out.println(CydeoSchool.instructors);
        System.out.println("==============");
// sandwiches tests
        System.out.println(sergei.myOwnSundwich.sundwichesLeft);
        sergei.eat();// - 2 sundwiches
        System.out.println(sergei.myOwnSundwich.sundwichesLeft);
        sergei.eat();// - 2 sundwiches
        System.out.println(sergei.myOwnSundwich.sundwichesLeft);
        sergei.eat();// - 2 sundwiches
        System.out.println(sergei.myOwnSundwich.sundwichesLeft);


    }
}
