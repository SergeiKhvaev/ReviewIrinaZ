package day21Loop;

public class FrequancyOfCharSelf {
    public static void main(String[] args) {
        String str = "Apple";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int counter = 0; // reset with every outter loop cycle begin

            if (!checked.contains("" + str.charAt(i))) { // мы пропускаем проверку буквы которую уже проверили, т.е если в слове две и более одинаковых буквы, нам достаточно посчитать количество одной из них, и если вторая встретиться в слове еще раз, ее проверка просто будет пропущена и начнется исполнение кода со следующей уникальной буквы в слове
                // continue; (если его здесь использовать, то это отдельное IF во внутреннем лууп // это ключивое слово не принято применять, поэтому принято применять другой путь --> if(!checked.contains(""+str.charAt(i))), в этом случае код буде работать так: если я проверяю букву которая не была еще проверена, то запускается код


                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        counter++;
                    }
                }
                System.out.println(str.charAt(i) + " " + counter);
                checked += str.charAt(i);

            }


        }
    }
}