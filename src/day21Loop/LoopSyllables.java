package day21Loop;

public class LoopSyllables {

    public static void main(String[] args) {
        // count hoq many syllables (слог) in word

        String str = "Sta-ro-voy-tova";
        int counter = 1;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '-'){
                counter++;
            }
        }
        System.out.println("In word " + "\""+  str +"\"" + " contains " + counter + " syllabes");




    }
}
