package replitacks;

public class CoverMe {
    /*
    input : String main = "java methods";
            String coverMe = "me";

             output:
             String result = "java [me]thods";

     input : String main = "apples";
            String coverMe = "pears";

             output:
             String result = "[apples]";
     */
    public static void main(String[] args) {


        String str = "apple";
        String inside = "pp";
        System.out.println(str.contains(inside));

String str2 = str.replace(inside, "[pp]");
        System.out.println(str2);
    }



}
