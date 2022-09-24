package day38accessmodifiers_encapulation.fligth;

public class FlightTiket {

    private String type;// (first, business, economy
    private String departure;
    private String arrival;


    public FlightTiket(String type, String departure, String arrival) {
        setType(type); // because in setter method we have additonal logic (if statment there)
    this.departure = departure;
        this.arrival = arrival;
    }

  public String getType() {
      return type;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("economy")){
            this.type = type;

        }

    }

   public String getDeparture() {
  return departure;
   }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

   public String getArrival() {
     return arrival;
  }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }


    public String toString() {
        return "FlightTiket{" +
                "type='" + type + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}