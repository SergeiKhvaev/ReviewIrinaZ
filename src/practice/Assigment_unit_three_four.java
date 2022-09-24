package practice;

public class Assigment_unit_three_four {

    // question 27

    static int count; // static variable, we can call by class name, no need create object

    public Assigment_unit_three_four(){// cunstructor 1
        count++;
    }

    public Assigment_unit_three_four(int i){// cunstructor 2
        count += i;
    }

    public Assigment_unit_three_four (String s){// cunstructor 3
        count += s.length();
    }

    public static void main(String[] args) {
        new Assigment_unit_three_four();
       Assigment_unit_three_four a = new Assigment_unit_three_four();
       Assigment_unit_three_four a2 = new Assigment_unit_three_four("fun");
       Assigment_unit_three_four a3 = new Assigment_unit_three_four(2);
        System.out.println(Assigment_unit_three_four.count);
    }
}
