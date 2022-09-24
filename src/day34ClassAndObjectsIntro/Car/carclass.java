package day34ClassAndObjectsIntro.Car;

public class carclass {
    String model;
    int year;
    String color;
    double fuelPercent;


    public void drive(){
        System.out.println("Driving - " + model + ", fuel ramains " + (fuelPercent = fuelPercent -5));

    }

    public void fillTank() {
        System.out.println("Fuel tank filled " + "full level - " + (fuelPercent = 100));
    }

        public boolean isLow(){
            boolean isLow = false;
            if (fuelPercent < 25){
                isLow = true;

            }
            return isLow;
        }



    public String toString() {
        return "carclass{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuelPercent=" + fuelPercent +
                '}';
    }
}

