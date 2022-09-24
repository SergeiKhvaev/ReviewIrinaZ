package adamofficehours.day3;

public class NamesHavesameFirstAndLAstLetter {
    public static void main(String[] args) {
        // напечатать как много имен начинаются и оканчиваются на одинаковые буквы

        String [] names = {"Anna", "Alia", "Adam", "Sergey", "Remus", "Muhtar", "Mehmet"};

        int count=0;

        for(String each : names){

          String first = each.charAt(0) +"";
            String last = each.charAt(each.length()-1) +"";

            if(first.equalsIgnoreCase(last)){
                count++;
                System.out.println(each);
            }
        }
        System.out.println(count);

    }
}
