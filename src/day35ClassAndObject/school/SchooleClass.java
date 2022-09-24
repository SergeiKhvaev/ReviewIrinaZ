package day35ClassAndObject.school;

public class SchooleClass {
    String name;
    int totalNumOfStud;
    double avrGpa;

    public SchooleClass(String name, int totalNumOfStud, double avrGpa) {
        this.name = name;
        this.totalNumOfStud = totalNumOfStud;
        this.avrGpa = avrGpa;
    } // generate constractor -> right click->constractor-> select all -> hit ok

    // public SchooleClass(String inputName, int //inputStedents, double inputGpa){
     //   name = inputName;
      //  totalNumOfStud = inputStedents;
     ///   avrGpa = inputGpa;

    //}


    public String toString() {
        return "SchooleClass{" +
                "name='" + name + '\'' +
                ", totalNumOfStud=" + totalNumOfStud +
                ", avrGpa=" + avrGpa +
                '}';
    }
}
