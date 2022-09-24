package day23ArraysLoopForEachLoops;

public class ArrayLoopTaskAvaregeNum {

    public static void main(String[] args) {

        System.out.println("EACH FOR LOOP+++++++++++++++++++++++++++++++++++++++++++");
        double[] prices = {13.99, 15.05, 9.56, 98.89};

        double sum = 0;
        for(double price : prices){
            sum+= price;
                }
        System.out.println(sum / prices.length);

        System.out.println(" FOR LOOP+++++++++++++++++++++++++++++++++++++++++++");
        double[] prices1 = {13.99, 15.05, 9.56, 98.89};
        double sum1 = 0;
        for(int i = 0; i < prices1.length; i++){
            sum1 += prices1[i];
        }
        System.out.println(sum1 / prices1.length);




    }
}
