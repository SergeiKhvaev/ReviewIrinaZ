package day30JavaMethodsPractice_wrapper;

public class EachCharacter {
    /*
    найти и напечатать отдельно каждый тип символа в отдельной строке
     */
    public static void main(String[] args) {
        String s ="49dfVA&jk33*82";
        String upper ="", lower ="", number ="", special ="";

        for(int i = 0; i< s.length(); i++){
            char letter = s.charAt(i);
            if(Character.isUpperCase(letter)){
                upper+=letter;
            } else if(Character.isLowerCase(letter)){
                lower += letter;
            }else if(Character.isDigit(letter)){
                number +=letter;
            }else{
                special += letter;
            }

    }
        System.out.println("upper case " + upper);// or we can split and we will have array
        System.out.println("lower case " + lower);
        System.out.println("numbers " + number);
        System.out.println("special charagters " + special);


    }





}
