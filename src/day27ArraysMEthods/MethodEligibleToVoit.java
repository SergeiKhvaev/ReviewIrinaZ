package day27ArraysMEthods;

public class MethodEligibleToVoit {

    public static void eligibleToVote(int age, boolean isCitizen){

        if(age >= 18 && isCitizen){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        eligibleToVote(21, true);
        eligibleToVote(17, false);
    }
}
