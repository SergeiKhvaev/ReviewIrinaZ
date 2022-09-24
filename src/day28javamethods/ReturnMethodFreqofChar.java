package day28javamethods;

public class ReturnMethodFreqofChar {
    /*
    Frequency of Character
create a method that will accept a word(String) and a letter (char)
and return how many times that given letter is found in the given word
Ex:
	Input:
		apple, p
	Output:
		2
Ex:
	Input:
		apple, z
	Output:
		0
Ex:
	Input:
		aabbaacca, a
	Output:
		5
     */

    public static void main(String[] args) {
        System.out.println(freqOfChar("Aaapplea", 'p'));
    }

    public static int freqOfChar (String str, char a){

        str = str.toLowerCase();
        int counter = 0;
        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) == 'a'){
                counter++;
            }
        }
        return counter;



    }

}
