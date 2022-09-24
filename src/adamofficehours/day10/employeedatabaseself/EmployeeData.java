package adamofficehours.day10.employeedatabaseself;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeData { // создали класс, который будет давать возможсность создавать ArrayList, элементами которого будут non-primitive data types - objects from Employee class(each element of ArrayList is separete Employee(collection of info about certain object employee

    static ArrayList <EmployeeSelf> dataBase = new ArrayList<>();// define - type of ArrayList is object from class EmployeeSelf class


    // add new person
    public void addEmployee (EmployeeSelf newPerson){ // in parameter we put new object (Data type(class) name of object
        dataBase.add(newPerson);
    }

    // delete object from list using given id

    public void deletePerson(long id){
      //  dataBase.removeIf(p ->id == id); // figur it out how limbda works

       dataBase.removeIf(each -> each.id == id); // где each является отдельным элементом ArrayListaб т.е отдельным object Employee
    }


    public ArrayList<EmployeeSelf> getAllPersons(){
        return dataBase;
    }

public EmployeeSelf getPersonsWithID(long id) {
    for (EmployeeSelf each : dataBase) {
        if (each.id == id) {
            return each;
        }
    }
    return null;
}

public ArrayList <EmployeeSelf> getAllPersonsWithId (long num){
        ArrayList <EmployeeSelf> allPersonsWithId = new ArrayList<>();

        for(EmployeeSelf each : dataBase){
            if(each.id == num){
                allPersonsWithId.add(each);
            }
        }
        return allPersonsWithId;

}


}
