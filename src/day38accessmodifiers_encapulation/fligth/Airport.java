package day38accessmodifiers_encapulation.fligth;

public class Airport {
    public static void main(String[] args) {
        FlightTiket tiket1 = new FlightTiket("first", "Orlando", "New York");
        // or we can creat toString method in class and call all info obout object together
     System.out.println(tiket1.getType());
       System.out.println(tiket1.getArrival());
      System.out.println(tiket1.getDeparture());
        System.out.println(tiket1);

        FlightTiket tiket2 = new FlightTiket("Fligth", "Washington", "Ohia");// type = null, because setter has if statment condition
       System.out.println(tiket2.getType()); // didnt assighn anything
      System.out.println(tiket2.getArrival());
     System.out.println(tiket2.getDeparture());
       tiket2.setType("business"); // setter allow as to reasignt it
     //   System.out.println(tiket2.getType());
        System.out.println(tiket2);


    }


}
