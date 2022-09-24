package day28javamethods;

public class ReturnMEthodFixFormat {

    /*
Fix Format

create a method will accept a String and return a String in proper
format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James

     */
    public static void main(String[] args) {
        System.out.println(fixedFormat("sergeIEKAteriANA"));

    }


    public static String fixedFormat (String str){

      String fixedWord = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return fixedWord;
    }


}
