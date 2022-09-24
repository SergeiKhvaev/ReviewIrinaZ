package day21Loop;

public class FriquancyOfChar {
    public static void main(String[] args)
    { //  given java
        //output j -2, a - 2, v -1

        String str = "java";
        String checked ="";


        for(int i = 0; i <str.length(); i++){ // внешний луп повторяет один символ необходимое количество раз

            int counter = 0; // должен ресет на зиро при каждом символе
           if(checked.contains("" + str.charAt(i))){// продолжает только считать внутренний луп, если символ уже был проверен
                continue;
          }
            for(int j = 0 ; j < str.length(); j++){ // внутренний луп сравнивает символ at i с каждым символом в строке --> charAt(j)
                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                }
            }

            System.out.println(str.charAt(i) + " - " + counter);
            checked += str.charAt(i);
        }













    }

}
