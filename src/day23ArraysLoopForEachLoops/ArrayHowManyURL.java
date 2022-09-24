package day23ArraysLoopForEachLoops;

public class ArrayHowManyURL {
    public static void main(String[] args) {


        String[] urls = {"big.com", "wikimedia.org", "twitter.com", "amazon.com", "mail.ru", "japanpost.jp", "nasa.gov", "military.com", "ecla.edu", "linkedin.com", "mysgr.com", "github.io", "spotify.com", "mozilla.org", "tema.edu", "utexas.edu", "babr.ru"};

        int com = 0;
        int org = 0;
        int edu = 0;
        int ru = 0;
        for(int i = 0; i < urls.length ; i++){
            if (urls[i].contains("com")){
                com++;
            } else if (urls[i].contains("org")) {
                org++;
            }else if (urls[i].contains("edu")){
                edu++;
            } else if (urls[i]. contains("ru")){
                ru++;
            }
        }
        System.out.println(".com - " + com);
        System.out.println(".org - " + org);
        System.out.println(".edu - " + edu);
        System.out.println(".ru - " + ru);



    }
}