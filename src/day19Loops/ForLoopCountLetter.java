package day19Loops;

public class ForLoopCountLetter {

    public static void main(String[] args) {
        /// frequency letter in word word: java how many letter 'a' char


int count = 0;

String word = "java";
for (int i = 0; i < word.length(); i ++){ // i <=word.length()-1
   if(word.charAt(i) == 'a'){
       count++;
   }
}
        System.out.println(count);




    }
}
