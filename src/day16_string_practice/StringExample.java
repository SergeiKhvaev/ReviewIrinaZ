package day16_string_practice;

public class StringExample {
    public static void main(String[] args) {
        // дается эладрес, отделить имя от домена (saim@cydeo.com: name - saim, domain - cydeo)

        String email = "saim@cydeo.com";
        System.out.println("");

        int indexOfAt = email.indexOf('@');
        String name = email.substring(0, indexOfAt);
        int indexOfDot = email.indexOf('.');
        String domain = email.substring(email.indexOf('@') + 1, email.indexOf('.'));

        System.out.println(email);
        System.out.println(name);
        System.out.println(domain);
    }





}
