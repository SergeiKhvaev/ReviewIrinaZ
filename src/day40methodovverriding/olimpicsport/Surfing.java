package day40methodovverriding.olimpicsport;

public class Surfing extends OlimpicSport {
    /*
    Create a class Surfing
	child class of OlympicSport
	constructor: set name and participants variables
	methods:
		compete(): Print Surfing the waves
     */

    String mainCondition;

    public Surfing(int participant, String mainCondition){
        super("Surfing", participant);
        this.mainCondition = mainCondition;
    }

    static { // static block, will execute with first time class uploaded
        System.out.println("Ocean with waves");
    }

    @Override
    public String compete(){
        return "Surfing the waves";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", mainCondition='" + mainCondition + '\'' +
                '}';
    }
}
