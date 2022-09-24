package practice.bigtask;

public class BuildingObject {
    public static void main(String[] args) {
        OfficeBuilding office1 = new OfficeBuilding("IL", 9000, 4);
        System.out.println(office1);
        System.out.println(office1.location);
        System.out.println(office1.price);
        System.out.println(office1.numberOfFloor);

        office1.pay();// Overriden from PArent class
        office1.elevator();// from implemented Interface

        // indirect reference by Parent

        Building office2 = new OfficeBuilding("OK", 8500, 15);
        System.out.println(office2);
        System.out.println(office2.location);
        System.out.println(office2.price);
        //System.out.println(office2.numberOfFloor);// no access, variable not belong to Parent class
        office2.pay();// belong to Parent, overriden in Subclass
        //office2.elevator();// no access, variable not belong to Parent class, which reference we use to reach object from Office class

        // indirect reference by Interface

        HasElevator office3 = new OfficeBuilding("TX", 10500, 25);
        System.out.println(office3);
        office3.elevator();// call because it belong to Interface, and implemented in class which object created
       // office3.location; // we do not have access because those methods and variables not belong to Interface, what reference we use to reach object OfficeBuildingclass
       // office3.price;
       // office3.numberOfFloor;
      //  office3.pay();





    }
}
