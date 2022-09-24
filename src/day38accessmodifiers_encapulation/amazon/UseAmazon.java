package day38accessmodifiers_encapulation.amazon;

public class UseAmazon {
    public static void main(String[] args) {
        Amazon buyItemOne = new Amazon("Phone", "Skhvalev83@gmail.com", false);
        System.out.println(buyItemOne);
        buyItemOne.setUserName("laptop");
        System.out.println(buyItemOne.getEmail());
        System.out.println(buyItemOne.getUserName());
        System.out.println(buyItemOne.isPrime());
        System.out.println(buyItemOne.getEmail());
        buyItemOne.setEmail("vestra888@gmail.com");
        buyItemOne.setPrime(true);
        buyItemOne.setUserName("laptop");
        System.out.println(buyItemOne);


        System.out.println("========================");

        Amazon buyItem1 = new Amazon("Airpods", "Sergei@gmail.com", true);
        // System.out.println(buyItem1.getUserName());
        System.out.println(buyItem1);

    }
}
