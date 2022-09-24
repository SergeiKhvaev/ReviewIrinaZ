package day44_abstraction_polimorphism2.clothes;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        // all possible referances Tsirt and jacket

        //tshirt
        System.out.println("======================");
        Tshirt tshirt1 = new Tshirt();
        tshirt1.wear();
        Clothes tshirt2 = new Tshirt();
        tshirt2.wear();


        // jacket
        Jacket jacket1 = new Jacket();
        Clothes jacket2 = new Jacket();
        jacket2.wear();

        System.out.println("======================");
        HasHood jacket3 = new Jacket();// interface reference


        Clothes[] inventory = new Clothes[10];
        inventory[0] = new Tshirt();
        inventory[1] = tshirt1;
        inventory[2] = jacket1;
        inventory[3] = tshirt2;
        inventory[4] = jacket2;
        //inventory[5] = jacket3;

        ArrayList<Clothes> list = new ArrayList<>();

        list.add(new Jacket());
        list.add(new Tshirt());
        //list.add(new Hat());

        for (Clothes each : inventory) {
            each.wear();
        }
    }
// доделать
        public static void buy (Clothes clothes ){

            if(clothes instanceof Jacket){
                System.out.println("Jackets cost 29.99");
            } else if(clothes instanceof Hat){
                System.out.println("Hats cost 19.99");
            } else if(clothes instanceof Tshirt){
                System.out.println("Tshirt is 9.99");
            }


        }

    }
class Hat extends Clothes{
    @Override
    public void wear() {
        System.out.println("wearing hat");
    }
}
