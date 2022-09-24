package day7Practice;

public class LogicalOperators {

    public static void main(String[] args){

        int salary = 80_000;
        int creditScore = 745;
        boolean getLoan = creditScore >= 720 && salary >= 100_000;
        boolean getLoan2 = creditScore >= 740 && salary >= 80_000;
        boolean canGetLoan = getLoan || getLoan2;

        System.out.println("Get loan: " + getLoan);
        System.out.println("Get Loan: " + getLoan2);
        System.out.println("Am I considirable to get loan: " + canGetLoan);
int b = 4;







    }
}
