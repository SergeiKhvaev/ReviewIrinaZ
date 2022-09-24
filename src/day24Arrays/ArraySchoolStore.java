package day24Arrays;

public class ArraySchoolStore {

    public static void main(String[] args) {

        String[] items = {"Bakcpak", "Jacket", "Shirt", "Mackboock", "NoteBook"};
        double [] price = {2,5,6,3, 4};
        int[] itemId = {50, 60,56,78,88};
        //price catalog
        System.out.println("Full catalog \n ID \t | PRICE");
        for(int i = 0; i < items.length; i++)
        System.out.println(items[i] + "|" + price[i] + "|" + itemId[i]);

        boolean inStock = false;
        for(String eachItem : items) {
            if(eachItem.equalsIgnoreCase("shirt")) {
                inStock = true;
                break;
            }
        }

        System.out.println(inStock);

        // найти индекс shirt


        System.out.println("================");


        // найти инфрмацию о самой дорого вещи
        double maxPrice = price[0];// первая цегна по умолнчанию максимальная цена
        int indexOfMax = 0;

        for(int i = 0; i < price.length; i++){// можно начать с int i = 1 , т.к. первая цена уже проверена
            if(price[i] > maxPrice){
                maxPrice = price[i];
                indexOfMax = i; // тракинг индекс максимальной цены
            }
        }
        System.out.println("Most expensive " + items[indexOfMax] + "|" + price[indexOfMax] + "|" + itemId[indexOfMax]);

    }
}
