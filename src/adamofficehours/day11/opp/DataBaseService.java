package adamofficehours.day11.opp;

import java.util.List;

public interface DataBaseService {

    void addEmployee(Employee employee);//
    void deleteEmployee(Long id);// delete employee by ID
    Employee getEmployee(Long id); // get employee by ID
    List<Employee> allEmployees();
    List<String> getAllNames ();
    List<String> getUniqueName(); //




}
