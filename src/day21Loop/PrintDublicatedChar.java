package day21Loop;

public class PrintDublicatedChar {
    public static void main(String[] args) {

        // найти и вернуть повторяющиеся в строке буквы (использовать один лупп)
        // концепция решения

        String str = "aabbbffvbnmjh"; // absdf - output
        String newWord = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(newWord.contains(""+ str.charAt(i))){
                   continue;// если в этом слове храниться дубликат-буква, то ее больше не нужно проверять и сесь нижестоящий код пропускается
               }
                    for(int j = 0; j < str.length(); j++){
                        if(str.charAt(i) == str.charAt(j)){// последовательно сраниваем i внешнего лууп с j, перебераемым внутренним лууп
                            count++;}// счетчик шелкает столько раз сколько встречается соответствующая буква в строке
             }// внутренний

            if(count > 1){// если счетчик больше одного раза, это означает, что буква встретилась больше одного раза(дубликат)
                System.out.print((str.charAt(i))); // дубликат-букву из внешнего цикла мы и распечатываем
            }
newWord += str.charAt(i);// букву дубликат мы положили в отдельную строку, специально для этого созданную
        } // внешний

    }
}