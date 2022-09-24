package day34ClassAndObjectsIntro.house;

public class House {
    String type;
    double squarFeet;
    int numberOfBedrooms;
    boolean isCity;
    boolean hasGarage;
    int numberOfStoreys;

    public double calculateMorgage(){
        if(numberOfBedrooms < 2){
            return 1500;
        }else if (numberOfBedrooms < 4){
            return 2000;
        }else{
            return 2500;
        }
    }

    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", squarFeet=" + squarFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", isCity=" + isCity +
                ", hasGarage=" + hasGarage +
                ", numberOfStoreys=" + numberOfStoreys +
                '}';
    }

}
