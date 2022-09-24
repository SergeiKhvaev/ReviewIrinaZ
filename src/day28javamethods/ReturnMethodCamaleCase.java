package day28javamethods;

public class ReturnMethodCamaleCase {
    /*
    Camel Case

create a method that will accept a String, of words separated by spaces,
and return a camel case version of the String where the first letter
of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase

Ex:
	Input:
		JAVA will ruLE tHe wORLd

	Output:
		javaWillRuleTheWorld


     */
    public static void main(String[] args) {
        System.out.println(camleCaseconverter("I lOVE javA"));

        char a = 'a';
        String c = "" + a;

//String b = c.toUpperCase();
       // System.out.println(a);
        //System.out.println(b);

String j = "cava";
        System.out.println(j.toUpperCase().charAt(1));



    }

    public static String camleCaseconverter(String str){
      str = str.toLowerCase();// нужно переназначать, т.к. нужно создать новую строку в нижмем регистре
      String camleCase ="";
for(int i = 0; i < str.length() ; i++){

    if (str.charAt(i) == (' ')){
      camleCase +=  str.toUpperCase().charAt(i+1);// делаем следующий за пробелом символ в верхнем регистре и прибавляем его в строку
      i++; // нужен что бы перепрыгнуть пробел при следующей итерации
    } else {
        camleCase += str.charAt(i);
    }

}
        return camleCase;

    }


    }


