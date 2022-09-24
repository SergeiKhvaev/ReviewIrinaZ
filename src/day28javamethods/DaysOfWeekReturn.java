package day28javamethods;

public class DaysOfWeekReturn {
    public static void main(String[] args) {
        System.out.println(dayInWeek(4));
        System.out.println(dayInWeek(7));

        switch (dayInWeek(3)){
            case"Mon":
                System.out.println("Full day of JAVA");
                break;
            case"Tue":
                System.out.println("Half Java");
                break;
            case"Wed":
                System.out.println("Office");
                break;
            case"Sat":
            case "Sun":
                System.out.println("Off days");
                break;
            default:
                System.out.println("Invalid number");
                break;

        }
    }

    public static String dayInWeek(int day){
        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        return days[day -1];
    }
}
