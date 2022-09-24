package day14string;
public class stringMethodPractice {

    public static void main(String[] args) {


        System.out.println("Enter web Site");
        String webSite = "www.corruption.com";
        String website1 = "www.corruption.com";


        if (webSite.startsWith("www.") && (webSite.endsWith(".com") || webSite.endsWith(".edu") || webSite.endsWith(".gov") || webSite.endsWith(".net"))) {
            System.out.println("Valid website");
        } else {
            System.out.println("Invalid website");




        }

    }
    }