package day36classandobject.hobby;

public class Hobby {
    /*
  create a class called Hobby
        - data:
            name, annual cost, is outdoors (boolean), requires others (boolean)
        - constructor
            - create a constructor that creates a Hobby object with the name
            - create a constructor that creates a Hobby object with the name and annual cost
            - create a constructor that creates a Hobby object with the name,
annual cost, is outdoors, and requires others
        - method:
            - doIt():
                print: Doing $name-of-hobby $outside-or-inside
                    ex: new Hobby("golf", 100, true, false).doIt() -> Doing golf outside
                    ex: new Hobby("puzzles", 50, false, true).doIt() -> Doing puzzles inside
            - toString()
                print all the Hobby information
    Create a separate class to create and test the Hobby objects
        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
     */
    String name;
    double annualCoast;
    boolean isOutDoor;
    boolean isOtherPeopleReq;

    public Hobby(String name){
        this.name = name;
    }
    public Hobby(String name, double annualCoast){
        this(name);
        this.annualCoast = annualCoast;
    }
    public Hobby( String name, double annualCoast, boolean isOutDoor, boolean isOtherPeopleReq){
        this(name, annualCoast);
        this. isOutDoor = isOutDoor;
        this.isOtherPeopleReq = isOtherPeopleReq;
    }

    public String doIt(){
        String str = "Doing " + name +", " + "cost is " + annualCoast +"(annually),";
        if(isOutDoor){
            str += " outside actions";
        } else {
            str +=" inside actions";
        }
        return str;
    }

    public String toString() {
        String str = "name = " + name;
        if (annualCoast != 0){
            str+= ", annualCoast = " + annualCoast;
        } if(isOutDoor){
            str += ", outdoor action";
        } else {
            str += ", indoor action";
        }
        if(isOtherPeopleReq) {
            str += ", other people need for actions";
        } else {
            str += ", play alone";
        }

        return  str;
    }
}
