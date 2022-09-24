package day34ClassAndObjectsIntro.JobTitleParametr;

public class jobTitleParameter {
    String positionTitle;
    double salary;
    boolean isRemote;
    boolean isExpirience;
    char gender;

    public jobTitleParameter(String positionTitle, double salary, boolean isExpirience, boolean isRemote, char gender){ // created constractor method with parameters
        this.positionTitle = positionTitle;
        this.salary = salary;
        this.isExpirience = isExpirience;
        this.isRemote = isRemote;
        this.gender = gender;
    }

    public String inf(){
        return "for " + positionTitle + " salary is " + salary;

    }

    public String toString() {
        return "jobTitleParameter{" +
                "positionTitle='" + positionTitle + '\'' +
                ", salary=" + salary +
                ", isRemote=" + isRemote +
                ", isExpirience=" + isExpirience +
                ", gender=" + gender +
                '}';
    }
}


