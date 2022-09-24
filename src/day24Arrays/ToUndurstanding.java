package day24Arrays;

import java.util.Arrays;

public class ToUndurstanding {

    public static void main(String[] args) {

        String[] words ={"Eva", "Sergei", "Katy"};

        String[] reverse = new String[3];
        int y = 0;

        for(int i = words.length-1; i >=0; i--){
            reverse[y] = words[i];
            y++;
        }

        System.out.println(Arrays.toString(reverse));
    }
}
