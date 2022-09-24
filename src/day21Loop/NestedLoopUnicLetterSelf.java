package day21Loop;

public class NestedLoopUnicLetterSelf {
    public static void main(String[] args) {

        String str ="dfferrddfddf";
        int counter = 0;

        for(int i = 0; i < str.length() ; i++){ // внешний лууп
            counter = 0;// обнуляем при каждой внешней итерации, что бы считать каждый i индекс с нуля
                        for(int j = 0 ; j < str.length() ; j++){// внутренний лууп, сравнивает индекс i внешнего лууп через изменение инедекса j, принадлежащего внутренниму лууп
                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                }

            } // inner

            if(counter == 1){// если счетчик равен 1, значит символ при сравнении луупов встретился только один раз
                System.out.println(str.charAt(i));
            }

        }//outer





    }
}
