package day40methodovverriding.olimpicsport;

public class Track extends OlimpicSport{

    String mainCondition;

    public Track(int participant, String mainCondition){
        super("Track", participant);
        this.mainCondition = mainCondition;
    }

    public String compete(){
        return "Track for running, jumping, throwing";
    }

    @Override
    public String toString() {
        return super.toString() + ", Track " +
                "mainCondition = " + mainCondition +
                "}";
    }
}
