package practice.codingbat;

public class Ayk {
    /*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") ? "pak"
stringYak("pakyak") ? "pak"
stringYak("yak123ya") ? "123ya"

     */
    public static void main(String[] args) {

        System.out.println(stringYak("pakyak"));


    }





    public static String stringYak(String str) {
        String result = "";

        for (int i=0; i<str.length(); i++) {
            // Look for i starting a "yak" -- advance i in that case
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {// ��������� ������� ����� "yak" ����� �������
                i =  i + 2;// ���� if ������� �����������, �� ������ ������������� ��� �������� + 2, ����� ���� ��� ����������������� else, ���������� ���������� ����� ����� "yak" � result
            } else { // Otherwise do the normal append
                result = result + str.charAt(i);
            }
        }

        return result;
    }



    public String stringYakAnotherSolving(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if(str.contains("yak")){
                newStr = str.replace("yak", "");
            }
        }
        return newStr;
    }




}
