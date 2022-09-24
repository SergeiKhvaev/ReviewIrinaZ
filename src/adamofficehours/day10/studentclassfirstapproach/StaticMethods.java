package adamofficehours.day10.studentclassfirstapproach;

import java.util.ArrayList;

public class StaticMethods {
    // we will create ArrayList <Student> class = new ArrayList<>(); separatly and will apply following methods



    // get whole ArrayList
    public static ArrayList<Student> getAllStidents(ArrayList<Student> list){
        return list;
    }

    // get student name which name with given char
    public static ArrayList <Student> getParticularName(ArrayList<Student> list, char neededChar){
        ArrayList<Student> newList = new ArrayList<>();

        for(Student eachElement : list){
            if(eachElement.name.contains("" + neededChar)){
                newList.add(eachElement);
            }
        }
        return newList;
    }


    //get students id is bigger then  (long id - given id)

    public static ArrayList<Student> idBiggerThenNum(ArrayList <Student> list, long num){
        ArrayList<Student> newList = new ArrayList<>();
for(Student eachElement : list){
    if(eachElement.id > num){
        newList.add(eachElement);
    }
}
        return newList;

    }

    //- delete student with (long id - given id)
    public static ArrayList <Student> deleteByIdNum (ArrayList <Student> list, long num){
        list.removeIf(eachElement -> eachElement.id == num);

        return list;

    }


   // delete student if name contains (char ch - given char)

    public static ArrayList<Student> deleteByCharInName (ArrayList<Student> list, char needed){
        list.removeIf(eachElement -> eachElement.name.startsWith(""+needed));

        return list;
    }
// get by gender
    public static ArrayList<Student> getByGender(ArrayList<Student> list, char gender){
        ArrayList<Student> newList = new ArrayList<>();
        for(Student eachElement : list){
            if(eachElement.gender == gender){
                newList.add(eachElement);
            }
        }
        return newList;

    }





}


