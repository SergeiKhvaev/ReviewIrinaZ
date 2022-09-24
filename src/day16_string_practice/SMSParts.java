package day16_string_practice;

import javax.sound.midi.Soundbank;

public class SMSParts {
    public static void main(String[] args) {


        String smsParts = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        int firstChatSender = smsParts.indexOf('<');
        int lastCharSender = smsParts.indexOf('>');
        String sender = smsParts.substring(firstChatSender+1, lastCharSender);

        int firstCharNumber = smsParts.indexOf('[');
        int lastCharCharNumber = smsParts.indexOf(']');
        String number = smsParts.substring(firstCharNumber+1, lastCharCharNumber);

        int firstCharMessage = smsParts.indexOf('{');
        int lastCharMessage = smsParts.indexOf('}');

        String message = smsParts.substring(firstCharMessage+1, lastCharMessage);

        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Massege: " + message);






    }

}
