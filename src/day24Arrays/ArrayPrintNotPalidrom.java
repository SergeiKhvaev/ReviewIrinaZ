package day24Arrays;

public class ArrayPrintNotPalidrom {

    public static void main(String[] args) {

        /*
        Given a String array. Find and print  not Palindrome String in your array.

		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome
         */
        String[] words = {"abc", "dna", "kevin", "joe", "lamp"};

        int count = 0; // считаем количество полиграмов
               for(String each : words){// создаем each for loop для прокрутки каждого элемента массива
                   String eachReverse ="";// создаем для хранения реверса каждого элемента. Строка обновляется до пустой строки, при каждом начали итерации внешнего лууп
           for(int i = each.length() - 1; i >= 0; i--){// создаем для внутренний лууп для построения реверса каждого элемента массива
               eachReverse += each.charAt(i); // помещаем реверс элемента в созданную ранее переменную
           }
           if(each.equals(eachReverse)){ // ВАЖНО! Здесь мы выявляем является ли реверс каждого элемента массива палиграмом
            count++;// Если реверс является полиграммом, то считаем количество полиграммов
            break;// если нашли хотя бы один палиграмм, прерываем дальнейший код за ненадобностью, т.к. как минимум один палирамм, есть

           }
           }
               if(count >0){// отдельный IF statment за пределами всех лууп, который проверяет весь массив на наличие в нем хотя бы одного полиграм. Если счет который мы ведем в циклах больше одного - значит в массиве выявлен как минимум один полиграмм
                   System.out.println("Poligran exist");
               } else{
                   System.out.println("No poligram");// срабатывает, если полиграм не выявлено, т.е. если count = 0
               }


       }// outer
        //сделать через счетчик



        }
