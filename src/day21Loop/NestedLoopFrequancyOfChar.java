package day21Loop;

public class NestedLoopFrequancyOfChar {
    public static void main(String[] args) {

        String str = "sssnnndddkkdjfkjj";
        String checked = "";
        for(int i = 0; i < str.length(); i++){
            int counter = 0;
            if(checked.contains(""+ str.charAt(i))){
                continue;
            }
                for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                }
            } //inner
            System.out.println("" + str.charAt(i) + " " + counter);
            checked += str.charAt(i);

        }//outer




    }
}
