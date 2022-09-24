package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class TuUnderstan {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 10, 5, 6, 2));
        ArrayList<Integer> res = new ArrayList<>();
        for (int each : list) {
            switch (each) {
                case 1:
                case 2:
                    res.add(0, list.get(0));
                    break;
                case 3:
                case 4:
                case 5:
                    res.add(4);
                    break;
                case 6:
                case 7:
                case 8:
                    res.set(1, 2);
                    break;
                case 9:
                default:
                    res.add(res.size());

            }
        }
        System.out.println(res);
    }
    }







