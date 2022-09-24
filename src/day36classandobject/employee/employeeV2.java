package day36classandobject.employee;

public class employeeV2 {
    String name;
    long id;
    String jobTitle;
    double salary;

    public employeeV2(String name) {
        this.name = name;
    }

    public employeeV2(String name, long id) {
        this(name);
    this.id = id;
    }

    public employeeV2(String name, long id, String jobTitle) {
        this(name, id);
        this.jobTitle = jobTitle;
    }

    public employeeV2(String name, long id, String jobTitle, double salary) {
        this(name, id, jobTitle);
        this.salary = salary;
    }

    @Override
    public String toString() {
        String output = "Name" + name;
        if(id != 0) {
            output += ", id: " + id;
        }
        if (jobTitle != null) {
            output += ", job title: " + jobTitle;
        }
        if(salary != 0){
            output += ", salary: $" + salary;

        }
        return output;
    }
}
