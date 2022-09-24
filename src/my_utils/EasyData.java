package my_utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EasyData {


    // возвращает arrayList дни недели для быстрого использования
    public static ArrayList<String> getDaysOfWeek() {
        // return ArrayList with all days of week
        return new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }


    // метод возврашает ArrayList с набором рандомных чисел для использования
    public static ArrayList<Integer> getRandomNumbers(int limit) { // через консоль мы определяем сколько рандомных чисел нам нужно в итоговом ArrayList
        Random random = new Random(); // Research about this class, look documantation
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            list.add(random.nextInt(1000));// ограичили 1000, т.е любое рандовное число будет не больше 1000
        }
        return list;
    }
}