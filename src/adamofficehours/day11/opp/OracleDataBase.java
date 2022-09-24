package adamofficehours.day11.opp;

import java.util.*;

public class OracleDataBase implements DataBaseService{

    List<Employee> oracleDataBase = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        oracleDataBase.add(employee);

    }

    @Override
    public void deleteEmployee(Long id) {
        oracleDataBase.removeIf(g -> g.getEmployeeId()==id);

    }

    @Override
    public Employee getEmployee(Long id) {
        for(Employee eachElement : oracleDataBase){
            if(eachElement.getEmployeeId() == id){
                return eachElement;
            }
        }
        System.out.println("No id in that database");
        return null;
    }

    @Override
    public List<Employee> allEmployees() {
        return oracleDataBase;
    }

    @Override
    public List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (Employee each : oracleDataBase)
            names.add(each.getName());
        return names;
    }

    @Override
    public List<String> getUniqueName() {
        // getAllNames();
        Set<String> emlployees = new HashSet<>(getAllNames());// set not allow duplicates, so we remove dublicates like that
       return new ArrayList<>(emlployees); // we convert result Set in list again, because return type is List


    }



}
