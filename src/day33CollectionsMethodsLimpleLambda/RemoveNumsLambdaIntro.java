package day33CollectionsMethodsLimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNumsLambdaIntro {
    public static void main(String[] args) {
        // remove all numbers less then 5

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,4,5,7,3,4,5,0,6,7,8,3,4,10,9));// не удалит должным образом потому, что лист будет сокращаться на а лууп будет +1 с каждой итерацией, это означает, что удалив число, следующий индекс сместится назад и будет пропущен лууп, т.е. некотоые индексы не будут проверены (И МЫ НЕДОЛЖНЫ ИСПОЛЬЗОВАТЬ FOR EACH LOOP В КОДАХ КОТОРЫЕ МЕНЯЮТ СУЩЕСТВУЮЩИЙ ЛИСТ, НУЖНО ИСПОЛЬЗОАТЬ ТРАДИЦИОННЫЙ ЛУУП// ТРАДИЦИОННОЕ ПРОВЕРКА ЧИСЕЛ И ДОБАВЛЕНИЕ ИХ В НОВЫЙ ЛИСТ БУДЕТ РАБОТАТЬ БЕЗ ДОПОЛНИТЕЛЬНОЙ ДЕКРИМЕНТИНГА КА НИЖЕ i--
        for(int i = 0; i  < nums.size(); i++){
            if (nums.get(i) < 5){
    nums.remove(i);
    i--;// что бы исключить скип индексов корректируем счет индексов в этом случае, будет проверен индекс при  смешении индексов во время удаления
            }
        }
        System.out.println(nums);

        System.out.println("==============SAME BUT WITH LAMBDA+++++++++++++++++++++");


        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,4,5,7,3,4,5,0,6,7,8,3,4,10,9));// remove all the numbers are less 5 - using removeIf
        nums2.removeIf(n -> n < 5); // n will be every element. n - this is every element of ArrayList, -> lambda(arrow is part of sintax), so we remove numbers we need without loop, dont need to handle with skiping indexes which exist with looping,
        System.out.println(nums2);

    }

}
