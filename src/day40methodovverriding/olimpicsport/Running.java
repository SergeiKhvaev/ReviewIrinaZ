package day40methodovverriding.olimpicsport;

public class Running {
    public static void main(String[] args) {

        Surfing surfingSport = new Surfing(2, "Ocean");
        System.out.println(surfingSport);
        System.out.println(surfingSport.name);
        System.out.println(surfingSport.participant);
        System.out.println(surfingSport.mainCondition);
        System.out.println(surfingSport.compete());
        System.out.println("==========================================");
        Track trackSport = new Track(1, "mounts");
        System.out.println(trackSport);
        System.out.println(trackSport.compete());
        System.out.println(trackSport.name);
        System.out.println(trackSport.participant);
        System.out.println(trackSport.mainCondition);

    }
}
