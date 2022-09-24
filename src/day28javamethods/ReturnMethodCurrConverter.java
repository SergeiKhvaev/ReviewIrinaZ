package day28javamethods;

public class ReturnMethodCurrConverter {
    /*
    Currency Converter
create a method that will accept a currency type(String) and a currency
amount (double)[as dollars] and convert the currency from dollars to a different type
Use the following information to convert from given
dollars to the desired currency type
1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee
Note: Don't worry about decimal formats, focus on method
Ex:
	Input:
		euro, 100
	Output:
		91
Ex:
	Input:
		yen, 50
	Output:
		6051.5
     */
    public static void main(String[] args) {
     //  System.out.println(curConverter("won", 1));

      //  System.out.println(curConverter2("euro", 1));
       System.out.println(curConverter3("ffff", 2));

        // факториал 5

        int factorial = 1;

        for(int i = 5; i > 0; i--){
          factorial *= i; // factorial = fatrorial * i - тоже самое
        }
        System.out.println(factorial);



    }

    public static double curConverter(String curName, double amount) { // создали метод включающий в себя switch cases. return в конце
        double total = 0;
        switch (curName) {
            case "euro":
                total = amount * 0.91;
                break;
            case "yen":
                total = amount * 121.03;
                break;
            case "lira":
                total = amount * 14.85;
                break;
            case "won":
                total = amount * 1217.52;
                break;
            case "rupee":
                total = amount * 181.45;
                break;
            default:
                System.out.println("Invalid currancy");
        }
        return total;


    }

    public static double curConverter2(String curNam, int amount) {

        switch (curNam) {
            case "euro":
                return amount * 0.91;

            case "yen":
                return amount * 121.03;
            case "lira":
                return amount * 14.85;
            case "won":
                return amount * 1217.52;
            case "rupee":
                return amount * 181.45;
            default:
                System.out.println("Ivalid currency");

        }
return 0;
    }


    public static String curConverter3(String curName, double amount) { // метод конвертер, который возвращает информацию в виде String
        String cur = "";
        double converAmount = 0;
        String total = cur + " " +  converAmount;

        switch (curName) {
            case "euro":
               converAmount = amount * 0.91;
                cur = "euro";
                break;
            case "yen":
               converAmount = amount * 121.03;
                cur = "yen";
                break;
            case "lira":
              converAmount = amount * 14.85;
                cur = "lira";
                break;
            case "won":
              converAmount = amount * 1217.52;
                cur = "won";
                break;
            case "rupee":
              converAmount = amount * 181.45;
                cur = "rupee";
                break;
            default:
                System.out.println("Invalid currancy");
        }
        return total;


    }







}

