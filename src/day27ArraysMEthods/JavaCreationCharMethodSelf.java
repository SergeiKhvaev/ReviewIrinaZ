package day27ArraysMEthods;

public class JavaCreationCharMethodSelf {

    public static void aZoreNine(){
        for(int i = 0; i <= 9; i++) {
            System.out.println(i);
        }


    }

    public static void aToz(){
        for(char i = 'a'; i <= 'z'; i++) {
            System.out.print(i+" ");
        }


    }

    public static void AToZ(){
        for(char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i+" ");
        }


    }

    public static void zToa(){
        for(char i = 'z'; i >= 'a'; i--) {
            System.out.print(i+" ");
        }


    }

    public static void ZToA(){
        for(char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i+" ");
        }


    }

    public static void main(String[] args) {



        aZoreNine();

        aToz();
        System.out.println();
        AToZ();
        System.out.println();
        zToa();
        System.out.println();
        ZToA();

    }
}
