package day18_whale_loop_practice;

public class DoWhileLoopExample {

    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println(i);
        }while(false); // один раз вернет 0, за тем исполнение остановится, т.е. false. НО ОДИН РАЗ РАСПЕЧАТАЕТ 0 В ЛЮБОМ СЛУЧАЕ

        System.out.println("=======================================================");

        do{
            System.out.println(i);
            i++;
        }while(i <= 10);  // распечатает с 0 - 10б при этом 0 будет распечатан в любом случае, т.к. код выполнется один раз вне зависимости от условия цикла

        






    }
}
