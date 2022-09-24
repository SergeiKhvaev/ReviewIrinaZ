package day17_strings_loops;

import java.sql.SQLOutput;

public class smsParts {
    public static void main(String[] args) {
        // separete sms by parts

        String sms = "<bond>. From number: [23232323232]. + Message: {I love java PROGRAMMING and problem solving}";
        int startSender = sms.indexOf('<');
        int endSender = sms.indexOf('>');
        String sender = sms.substring(startSender + 1,endSender);

        int startNumber = sms.indexOf('[');
        int endNumber = sms.indexOf(']');
        String number = sms.substring(startNumber + 1, endNumber);

        int startMessage = sms.indexOf('{');
        int endMessage = sms.indexOf('}');
        String message = sms.substring(startMessage +1, endMessage);

        System.out.println("Sender " + sender);
        System.out.println("Number " + number);
        System.out.println("Massege " + message);











    }

}
