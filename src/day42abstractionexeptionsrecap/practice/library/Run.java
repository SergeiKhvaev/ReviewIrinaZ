package day42abstractionexeptionsrecap.practice.library;

public class Run {
    public static void main(String[] args) {
        Library memberOne = new Library();


           memberOne.getLibraryCard("Fairfax");


try {
    System.out.println(memberOne.borrow(false));
}catch(FailToCheckOutEception e){
        e.printStackTrace();

    }

        try {
            System.out.println(memberOne.borrow(true));
        }catch(FailToCheckOutEception e){
            e.getMessage();

        }


}
    }
