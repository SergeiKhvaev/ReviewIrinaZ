package day36classandobject.offer;

public class offer {
    /*
    create a class called Offer
        - data:
            company, location, salary, is full time, number of PTO(pay time Off)
        - constructor
            - create a constructor that creates an Offer object with the company and location
            - create a constructor that creates an Offer object with the company, location, and salary
            - create a constructor that creates an Offer object with the company,
 location, salary, is full time, and number of PTO
        - method:
            toString()
                print all the employees information
    Create a separate class to create and test the Offer objects
    create multiple Offer objects and store them into an ArrayList of Offers.
Create multiple other Lists to filter out different information:
        write a program that can only keep the offers from local area
        write a program that can remove the offers that are not full Time
        write a program that removes all offer that are less than 100,000 salary
        - Find the biggest and lowest salary Offers and print the whole object
     */
    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPto;

    public offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public offer(String company, String location, double salary) {
        this(company, location);
        this.salary = salary;
    }

    public offer(String company, String location, double salary, boolean isFullTime, int numberOfPto) {
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPto = numberOfPto;
    }

    public String toString() {
        return "offer{" +
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPto=" + numberOfPto +
                '}';
    }


}
