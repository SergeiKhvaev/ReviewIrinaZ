package adamofficehours.day10.studentsclasssecondapproch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataBaseOfStudents {

   static ArrayList<Person> batch26 = new ArrayList<>(); // посуществу создали обычную переменную, в виде ArrayList/ made it static to full list with objects by automatic running static block

    static {
        System.out.println("Run static block");
        Person jose = new Person("Jose", 29, 1);
        Person ekaterina = new Person("Ekaterina", 36, 2);
        Person john = new Person("John", 39, 3);
        Person anatoliy = new Person("Anatoliy", 49, 5);
        Person mike = new Person("Mike", 25, 6);
        Person eva = new Person("Eva", 27, 7);

        batch26.addAll(Arrays.asList(jose, ekaterina,john, anatoliy, mike, eva));
    }


    // get all class


    public ArrayList<Person> getAllPersons(){

        return batch26;
    }
    //- get student name, which contains - (char ch - given char)
    public ArrayList <String> getParticularName(ArrayList<Person> batch26, char needed){
ArrayList<String> names = new ArrayList<>();
for(Person eachElement : batch26){
    if(eachElement.name.contains(""+ needed)){
        names.add(eachElement.name);
    }
}
return names;
    }


    // get students id is bigger then  (long id - given id)
    public ArrayList<Person> getStudentsById(ArrayList<Person> batch26, long num){

        ArrayList<Person> studensbyId = new ArrayList<>();

        for(Person eachElement : batch26){
            if(eachElement.id > num){
                studensbyId.add(eachElement);
            }
        }
        return studensbyId;
    }


    //  delete student with (long id - given id)
    public ArrayList<Person> deleteById(ArrayList <Person> batch26, long num){
        ArrayList<Person> editedList = new ArrayList<>(batch26);
        editedList.removeIf(eachElement -> eachElement.id > num);

        return editedList;
    }


    //- delete student if name contains (char ch - given char)

    public ArrayList<Person> deleteByNameLonger(ArrayList<Person> batch26, int num){
        ArrayList<Person> editedList = new ArrayList<>(batch26);
        editedList.removeIf(eachElement -> eachElement.name.length() < num);

        return editedList;
    }



    public ArrayList<Person> deleteByNameLonger(int num){
        batch26.removeIf(eachElement ->eachElement.name.length()  > num);
        return batch26;


    }
}
