package adamofficehours.day3;

public class stringMethodsExplanation {
    //где начинается стринг объект? в  stuk and heap (in heap there is pool as well)   pool or heap memory

    String str = "Java"; // этот сринг храниться в POOL - один и тот же адрес с str2
    String str2 = "Java"; // этот стринг тот же в POOL
    //str == str2 --> true // т.к. в POOL создан один объект, иными словами адрес у str и str2 один и тот же


    String str3 = new String ("Java");
    String str4 = new String ("Java");
    //str3 == str2 --> false
    // str3 == str4 --> false

    // Т.o. для корректного стравнения стринг нужно использлвать стринг методы: equals(); or equalsIgorCase();
    //str.equals(str2) --> true
    //str3.equals(str2) --> true
    //str3.equals(str4) --> true





}
