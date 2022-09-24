package adamofficehours.day8;

import java.util.Arrays;

public class HidePassword {
    /*
    Task 2 : Hide Passwords
			        Given an array of passwords (String). Hide each password as a star (*) and show the hidden password
					Ex:
					Input:
					{"one", "hi", "hold}
					Output:
					[ ***, **, **** ]
     */
    public static void main(String[] args) {

        String []arr = {"one", "hi", "hold", "Sergei"};

        System.out.println(Arrays.toString(password(arr)));
    }


    public static String[] password (String [] arr){
        String [] newArr = new String[arr.length];
        int d = 0;
        for(String eachElement : arr){
            String hiddenWord = "";
            for(int i = 0; i < eachElement.length(); i++){
               hiddenWord += "*";
            }
            newArr[d] = hiddenWord;
            d++;
        }
        return newArr;
    }
}
