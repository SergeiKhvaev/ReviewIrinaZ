package day21Loop;

public class NestedLoopDeleteDuplicatechar {
    public static void main(String[] args) {

        String str = "aaabcccdeef";
        String newStr ="";// создали, что бы хранить там перебираемые циклом буквы
        for(int i = 0; i < str.length(); i++){
            if(!newStr.contains(str.substring(i, i+1))){// если строка newStr Ќ≈ содержит(т.е. символ уникален) в себе подстроку, котора€ начинаетс€ первой буквой str, то этот сивол хранить в newStr. ѕовтор€ем эту операцию пока длинна строки не закончитс€
                newStr+= str.charAt(i);
            }
        }
        System.out.println(newStr);

        System.out.println("================================");
        String str1 = "aaabcccdeef";
        String newStr1 = "";

        for(int i = 0; i < str1.length(); i++){
            if(!newStr1.contains("" +str1.charAt(i))){//если строка newStr Ќ≈ содержит(т.е. символ уникален) в сомвол под индексом str.charAt(i), то этот сивол хранить в newStr. ѕовтор€ем эту операцию пока длинна строки не закончитс€
                newStr1 = newStr1+str1.charAt(i);
            }
        }

        System.out.println(newStr);


    }
}
