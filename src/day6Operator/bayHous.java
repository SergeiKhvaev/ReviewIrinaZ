package day6Operator;

public class bayHous {

    public static void main(String[] args){

        int creditScore = 800;
        int salary = 160_000;

        boolean firstWayToGetLoan = creditScore >= 720 && salary >= 100_000;
        System.out.println("Loan approved: " + firstWayToGetLoan);
        boolean secondWayToGetLoan = creditScore >=740 && salary >=80_000;

        System.out.println("Loan approved: " + secondWayToGetLoan);




    }
}
