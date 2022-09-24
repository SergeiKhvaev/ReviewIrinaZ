package day37staticvariablesandmethod.car;

public class Driver {

    String name;
    long licenceNum;
    char licenceType;


    public Driver(String name, long licenceNum, char licenceType) {
        this.name = name;
        this.licenceNum = licenceNum;
        this.licenceType = licenceType;
    }


    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenceNum=" + licenceNum +
                ", licenceType=" + licenceType +
                '}';
    }
}
