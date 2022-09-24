package day40methodovverriding;

public final class FinalKeyWordExamples {


    public final int a = 10; // hardcoded instance variable, each object from that class can be changed that variable

    public final int b; // dynamic way

    public static final String PLANET = "Earth";// constant variable

    public FinalKeyWordExamples(int num) { // dynamic constructor with different names (that why we did not use word this.)
        b = num; // when the object is created, given argument will be value of b, then it can not be changed
    }
    /*public FinalKeyWordExamples(int b){ same just used similar variable b name (that whay in code bloc  this.b = b;
        this.b = b;
    }
     */



    @Override
    public String toString() {
        return "FinalKeyWordExamples{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
