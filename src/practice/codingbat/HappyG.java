package practice.codingbat;

public class HappyG {
    /*

    Õ≈ –≈ÿ≈ÕÕ¿ﬂ «¿ƒ¿◊¿!!!!!!!!!!!!!!!!
    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
    gHappy("xxggxx") ? true
    gHappy("xxgxx") ? false
    gHappy("xxggyygxx") ? false
     */
    public static void main(String[] args) {
        System.out.println(gHappyOne("xxggxx"));

    }

    public static boolean gHappyOne(String str) {
        boolean isHappy = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g' && str.substring(i, i + 2).contains("gg")) { //WHY IT DO NOT WORKS WITH str.charAt(i)+1 or str.charAt(i) -1????
                isHappy = true;
            }
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g' && !str.substring(i, i + 2).contains("gg")) {
                isHappy = false;
            }
        }
        return isHappy;
    }


    //System.out.println(gHappyTwo("xxgggxygg"));

    //
    public static boolean gHappyTwo(String str) {
        boolean isHappy = false;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(i) == 'g' && str.substring(i, i + 2).contains("gg")
                        || str.charAt(i) == 'g' && str.substring(i - 1, i + 1).contains("g")) { //WHY IT DO NOT WORKS WITH str.charAt(i)+1 or str.charAt(i) -1????
                    isHappy = true;
                } else {
                    isHappy = false;
                }

            }

        }


        return isHappy;

    }

    public boolean gHappy(String str) {
        boolean isHappy = false;
        char isG = 'g';
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == isG && str.charAt(i + 1) == isG
                    || str.charAt(i) == isG && str.charAt(i - 1) == isG ||
                    isG == str.charAt(i) && isG == str.charAt(i + 1) &&
                            isG == str.charAt(i + 2)) {
                isHappy = true;
            } else {
                isHappy = false;
            }

        }
        return isHappy;

    }
}










