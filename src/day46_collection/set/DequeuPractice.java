package day46_collection.set;

import java.util.ArrayDeque;

public class DequeuPractice {
    public static void main(String[] args) {
        ArrayDeque<String> quequ2 = new ArrayDeque<>();

        quequ2.offer("java"); // can use add method()
        quequ2.offer("tusday");
        quequ2.offer("Soft skills");
        quequ2.offer("automation");
        System.out.println(quequ2);
        System.out.println(quequ2.peek()); // or can use element() method
        System.out.println((quequ2.poll()));// or can use remove() method
        System.out.println(quequ2.peek());
        System.out.println(quequ2);

        quequ2.offerFirst("IPA"); // that method from Deque- method from Deque // add given element at begining
        System.out.println(quequ2);

        //quequ2.add(null); // null is not allowed
        System.out.println(quequ2);

        quequ2.pollLast();// remove last element, method comes from Deque
        System.out.println(quequ2);

        

       // new ArrayDeque<>().remove();// return exception
       // new ArrayDeque<>().poll(); // returns null, no exception
    }
}
