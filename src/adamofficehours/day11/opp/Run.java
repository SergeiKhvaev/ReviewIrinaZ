package adamofficehours.day11.opp;

import javax.xml.crypto.Data;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        DataBaseService oracleDataBase = new OracleDataBase();// create data base

        Employee emploey1 = new Employee("Adam", 1l);
        oracleDataBase.addEmployee(emploey1);
        System.out.println(emploey1);

       oracleDataBase.allEmployees();//??
       // System.out.println(employees);
Employee emloyee2 = new Employee("Anatoly", 2L);
oracleDataBase.addEmployee(emloyee2);

        System.out.println(oracleDataBase.allEmployees());
        System.out.println(oracleDataBase.getEmployee(1L));
        oracleDataBase.deleteEmployee(1L);
        oracleDataBase.allEmployees();





    }



}
