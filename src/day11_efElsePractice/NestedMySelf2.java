package day11_efElsePractice;

public class NestedMySelf2 {
    public static void main(String[] args) {

        int gradeLevel = 20;
        if(gradeLevel >= 1 && gradeLevel <= 18) {
            System.out.println("Valid grade level");
            if(gradeLevel <= 5){
                System.out.println("Elementary school");
            }
            else if(gradeLevel <= 8){
                System.out.println("Middle school");
            }
            else if(gradeLevel <= 12){
                System.out.println("High school");
            }
            else if(gradeLevel <= 16){
                System.out.println("College");
            }
            else if(gradeLevel <= 18){
                System.out.println("Grand school");
            }
        } else {
            if(gradeLevel < 1) {
                System.out.println("nothing before Elementary school");
            }
            else if (gradeLevel > 18){
                System.out.println("PHD");
            }


        }
    }
}
