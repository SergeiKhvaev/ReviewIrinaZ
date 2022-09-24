package day21Loop;

public class MultiTabSelf {
    public static void main(String[] args) {

        for(int i = 1; i < 5 ; i++){
            System.out.println("table for " + i);
            for(int j = 1 ; j <=7 ; j ++){
                System.out.print(i +" * " + j +" = " + i*j+ "    ");
            }
            System.out.println();

        }


    }
}
