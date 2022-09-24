package day21Loop;

public class BiggestStringSelf {
    public static void main(String[] args) {

        String str = "qqqwwww";
        String each = "";
        String longest = "";

        for(int i = 0; i < str.length()-1; i ++){
            each = each + str.charAt(i); // dropped first letter 'g'

             if(str.charAt(i) != str.charAt(i+1)) {

                if (each.length() > longest.length()) {
                    longest = each;
                }
                each = "";
            }

            if(i == str.length()-2 && str.charAt(i) == str.charAt(i+1)) {
                each = each + str.charAt(i+1);
                if (each.length() > longest.length()){
                    longest = each;
                }

            }


        }
        System.out.println(longest);


    }
}
