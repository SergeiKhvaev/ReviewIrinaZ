package day28javamethods;

public class CreditScorREturnMethod {

    public static void main(String[] args) {
        checkScore(800);// просто распечатали, но больше мы не можем использовать эту информацию она не reusible
        checkScore2(789);// ничего не показывает, но ничего не выходит, т.к. мы ни как ее не используем

        System.out.println(checkScore2(800)); // можем просто распечатать

        if (checkScore2(789)){ // однако здесь мы уже можем использовать возвращенную величину, в этом смысл return method, таким образом, резулььтат от ретерн метода мы можем использовать в коде дальше
            System.out.println("Get loan");
        } else {
            System.out.println("Get higher score");
        }


    }


    public static void checkScore (int score){
        if(score > 700){
            System.out.println("Good score");
        } else {
            System.out.println("Not good score");
        }
    }

public static boolean checkScore2 (int score){
        return score > 700;
}


}
