package adamofficehours.day11.opp;

public class Employee {
    private String name;
    private Long employeeId;

    public Employee(String name, Long employeeId) {
        setName(name);
        setEmployeeId(employeeId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.contains(" ")){
            System.out.println("Wrong name");
        }
        this.name = name;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
