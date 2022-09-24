package adamofficehours.day10.employeedatabaseself;

public class Run {
    public static void main(String[] args) {


        EmployeeData dataList = new EmployeeData(); // created empty ArrayList from EmployeeData class // and use the methods from same class to make different operations with ArrayList

EmployeeSelf sergei = new EmployeeSelf("Sergei", 39,1);
EmployeeSelf katy = new EmployeeSelf("Katy", 36, 2);
EmployeeSelf eva = new EmployeeSelf("Eva", 33, 3);
EmployeeSelf ethel = new EmployeeSelf("Ethel", 24,4);
EmployeeSelf lubava = new EmployeeSelf("Lubava", 40, 3);


// add new element to ArrayList
dataList.addEmployee(sergei); // рассматривать все как традиционный метод, вызывеется все по имени соответственно по имени объекта, если метод не static.
        dataList.addEmployee(katy);
dataList.addEmployee(ethel);
dataList.addEmployee(eva);
dataList.addEmployee(lubava);

// вызываем метод напечатать весь ArrayList, call method by object name, because of instance(not static)method
System.out.println(dataList.getAllPersons());

//delete person by certain id
dataList.deletePerson(1);
        System.out.println(dataList.getAllPersons());
        // //delete person by certain id
        dataList.deletePerson(4);
        System.out.println(dataList.getAllPersons());
        System.out.println(dataList.getPersonsWithID(3));
        System.out.println(dataList.getAllPersons());

        // получить всех у кого id = 3

        System.out.println(dataList.getAllPersonsWithId(3));




    }

}
