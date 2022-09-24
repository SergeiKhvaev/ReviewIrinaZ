package codingbatTasks;

public class Loops {

    public static void main(String[] args) {
        String str = "asxxxdsxxx";


        System.out.println(doubleX(str));

    }

    public static boolean doubleX(String str) {

        boolean isNextX = false;
        for(int i = 0; i <str.length() ; i++){
            int firstX = str.indexOf("x");

            if(!str.contains("x")){
                isNextX = false;
            } else if (str.substring(firstX).startsWith("xx")){
                isNextX = true;
            }

        }
        return isNextX;


        }


    }
