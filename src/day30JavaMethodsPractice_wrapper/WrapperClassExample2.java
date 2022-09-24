package day30JavaMethodsPractice_wrapper;

public class WrapperClassExample2 {
    public static void main(String[] args) {


        System.out.println("byte min: " + Byte.MIN_VALUE);
        System.out.println("byte max: " + Byte.MAX_VALUE);

        System.out.println("=================================================");
        System.out.println("int min: " + Integer.MIN_VALUE);
        System.out.println("int max: " + Integer.MAX_VALUE);
        System.out.println("=================================================");
        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isUpperCase('e')); // insted if(char >= 'A' && char <= 'Z'
      //  System.out.println(Character.LETTER_NUMBER(10));

        System.out.println("=========================================================");
        String s = "123";
        System.out.println(s+5); // that will be concatenation
        // теперь мы можем это сделать, более того мы можем сравнить число в String и int и т.д.
      int i =  Integer.parseInt(s);// convert String to int number
        System.out.println(i + 5); // now we do addition, not concatenation



    }

}
