package day42abstractionexeptionsrecap.practice.library;

public class Library {
    /*
    Create a class Library
    create a method getLibraryCard(String city)
        if the city is Fairfax or McLean print Library Card Created
        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call
    create a method borrow(boolean checkedOut)
        if the given checkedOut boolean is true print "Enjoy reading"
        but if the boolean is false throw your FailToCheckOutException
        -> handle this exception in the runner file
     */

    public void getLibraryCard (String city) {
        if(city.equalsIgnoreCase("Fairfax") || city.equalsIgnoreCase("Mclean")){
            System.out.println("Library card created");
        } else {
          throw new NonResidentException("Non resident for this library");
        }
    }

    public String borrow(boolean checkout)throws FailToCheckOutEception {
        if(checkout){
             return "Enjoy reading";
        } else{
           throw new FailToCheckOutEception("Unavailable for checkout");
        }
    }
}
