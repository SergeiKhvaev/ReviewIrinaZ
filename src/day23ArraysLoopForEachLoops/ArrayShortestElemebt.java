package day23ArraysLoopForEachLoops;

public class ArrayShortestElemebt {

    public static void main(String[] args) {

        String [] names = {"Sergy", "Katia", "Etel", "Anatoliy"};
        String shortest = names[0];// определяет по умолчанию что слово под индексом 0 в массиве самое короткое
        for(int i = 0; i < names.length ; i++){ // пишем обычный луп с шагом +1, где количество итераций равна количеству элементов в массиве, что бы сравнить каждый из них
            if(shortest.length() > names[i].length()){ // сравниваем  длинну элемента под индексом 0 с элементом под индексом 0, 1, 2, 3 при каждой итерации
                shortest = names[i]; // при каждой итерации по итогом простого и последовательного сравнения выявляем слово которое длиннее и ложим его на хранение в специально созданную строку. Соответственно после последнего цикла у нас остается самое длиный элемент (слово) в заданном массиве
            }
                    }
        System.out.println(shortest);

        System.out.println("------------------------------------------------------");

        String[] cars ={"BMW", "Merds", "Honda", "Toyota", "Tesla"};
        String longest = cars[0];
        for(int i = 0; i < cars.length; i++){
            if(longest.length() < cars[i].length()){
                longest = cars[i];
            }

        }

        System.out.println("Longest name of car brend is " + longest);

        System.out.println("------------------------------------------------------");

        String [] colorName = {"Blue", "White", "Red", "Orange", "Grey-purpule"};
        String longestName = colorName[0];// по умолчанию слово под первым индексом самое длинное в начале операци
        String shortestName = colorName[0]; //по умолчанию слово под первым индексом самое короткое в начале операци

        for(int i = 0 ; i < colorName.length; i++){
            if (longest.length() < colorName[i].length()) {
                longest = colorName[i];
            } else if (shortest.length() > colorName[i].length()){
                shortest = colorName[i];
            }
        }
        System.out.println("Longest element  in array - " + longest);
        System.out.println("Shortest element  in array - " + shortest);





    }
}
