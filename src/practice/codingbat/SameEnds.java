package practice.codingbat;

public class SameEnds {
    /*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
sameEnds("abXYab") ? "ab"
sameEnds("xx") ? "x"
sameEnds("xxx") ? "x"
     */

    public static void main(String[] args) {



    }

    public static String sameEnds1(String string) {

        for(int i=string.length()/2 ; i>=0 ; i--) {

            String r=string.substring(0, i);

            if(string.endsWith(r))
                return r; // return key word stops execution
        }
        return "";
    }
    public String sameEnds2(String string) {
        String longest = "";
        for(int i = string.length() / 2; i >=0 ; i--){
            if(string.endsWith(string.substring(0, i))){
                longest += string.substring(0, i);
                break; // breake stops // or put return key word stops execution like break key word
            }
        }

        return longest;
    }

    // Another solution

    public String sameEnds(String string) {
        int len = string.length();
        String fin = "";
        String tmp = "";
        for (int i = 0; i < len; i++) {
            tmp += string.charAt(i);
            int tmplen = tmp.length();

            if (i < len / 2 && tmp.equals(string.substring(len-tmplen,len)))
            fin = tmp;
        }
        return fin;
    }








}
