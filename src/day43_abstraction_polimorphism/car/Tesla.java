package day43_abstraction_polimorphism.car;

public class Tesla extends ElectricCar{


    // must implement two abstruct method from Parent - Electric class, and GrandParent - Car


    @Override
    public void Start() {
        System.out.println("Key card near");

    }

    @Override
    public void charge() {
        System.out.println("do not forget to charge, or no start");

    }
        public void closeDoor(){
            System.out.println("Close door");
        }

}
