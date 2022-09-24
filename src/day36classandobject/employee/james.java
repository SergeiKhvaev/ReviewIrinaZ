package day36classandobject.employee;

public class james {
    public static void main(String[] args) {

      //  employeeV2 james = new employeeV2("Anatoliy Gusev", 123, "COE", 165000);

       // System.out.println(james);


        employeeV2 james2 = new employeeV2("Sergei Khvalev");
        System.out.println(james2);// печатает без default (null or 0) потому, что мы в method toString положили if конструкцию, которая, не выводит информацию если по умолчанию она 0


        employeeV2 james3 = new employeeV2("Ekaterina Starovoitova: ", 124);
        System.out.println(james3);// печатает без default (null or 0) потому, что мы в method toString положили if конструкцию, которая, не выводит информацию если по умолчанию она 0


        employeeV2 james4 = new employeeV2("Sergei Khvalev: ", 4, "CEO");
       System.out.println(james3);// печатает без default (null or 0) потому, что мы в method toString положили if конструкцию, которая, не выводит информацию если по умолчанию она 0


        employeeV2 james = new employeeV2("Anatoliy Gusev", 123, "COE", 165000);
        System.out.println(james);// печатает без default (null or 0) потому, что мы в method toString положили if конструкцию, которая, не выводит информацию если по умолчанию она 0


    }

    }

