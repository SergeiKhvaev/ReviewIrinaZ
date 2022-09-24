package day11_efElsePractice;

public class PreCondition {

    public static void main(String[] args) {


        int grade = 8;
        // grede only 1 - 6 - this is precondition

        String location = " ";
        String teacher = " ";
        int numberOfGroups = 0;

        if (grade > 0 && grade <= 6) {
            if (grade == 1) {
                location = "Apple Orcharde";
                teacher = "Ms Smith";
                numberOfGroups = 5;
            } else if (grade == 2) {
                location = "Zoo";
                teacher = "Mr Bond";
                numberOfGroups = 3;
            } else if (grade == 3) {
                location = "Aqarium";
                teacher = "Mr Mo";
                numberOfGroups = 4;
            } else if (grade == 4) {
                location = "Museum";
                teacher = "Ms Amanda";
                numberOfGroups = 2;
            } else if (grade == 5) {
                location = "Theater";
                teacher = "Ms Brown";
                numberOfGroups = 5;
            }
               else if(grade == 6) {
                    location = "Cinema";
                    teacher = "Ms White";
                    numberOfGroups = 7;

            } else {
                System.out.println("Invalid grade");
            }
        }

        System.out.printf(location + " " + teacher + " " + numberOfGroups);

    }
}