package practice.social_media_task;

import java.util.ArrayList;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {

        Instagram instaOne = new Instagram("Sergei", "pass1");
        Facebook face1 = new Facebook("Katy", "passWor2", "FullNAme", 12, 4500);
        Instagram instaTwo = new Instagram("Anattoly", "pass3");
        Facebook face2 = new Facebook("Sergei", "passWor3", "FullNAme", 49, 4999);
        Instagram instaThree = new Instagram("Eva", "pass4");
        System.out.println("====================");
        instaThree.setNumberOfFolowers(3);
        System.out.println(instaThree.getNumberOfFolowers());
        System.out.println("=========================");
        Facebook face3 = new Facebook("Lubava", "passWor2", "FullNAme", 35, 1550);


        ArrayList<SocialMedia> list = new ArrayList<>();
        list.addAll(Arrays.asList(instaOne, face1, instaTwo, face2, instaThree, face3));
        System.out.println(list);


        for(SocialMedia eachElement : list){
            if(eachElement instanceof Facebook){
                if(((Facebook)eachElement).getNumberOfFriends() < 2500){
                    System.out.println("this facebook member " + eachElement.userName + " has  " + ((Facebook) eachElement).getNumberOfFriends());
                }

            }
        }

        System.out.println("===========================");
        for(SocialMedia eachElement : list){
            if(eachElement instanceof Instagram){
                System.out.println(eachElement);


                ((Instagram)eachElement).likePicture();
            }
        }

        ArrayList<SocialMedia> facebook = new ArrayList<>(list);

        ArrayList<SocialMedia> instagram = new ArrayList<>(list);

        for (int i = 0 ; i < facebook.size() ; i++){
            for (int j = 0 ; i < instagram.size() ; i++){
                if(facebook.get(i).userName.equals(instagram.get(j).userName)){
                    System.out.println("That person has " + instagram.get(j).userName + " accounts both on Facebook and Instagram");
                }
            }
        }

        System.out.println("-----------------------");
        // anothar way to solve las task
        ArrayList<SocialMedia> facebook1 = new ArrayList<>(list);
        facebook1.removeIf(each -> each instanceof Instagram);

        ArrayList<SocialMedia> instagram1 = new ArrayList<>(list);
        instagram1.removeIf(each -> each instanceof Facebook);

        for(SocialMedia each : facebook1){
            for(SocialMedia each1 : instagram1){
                if(each.userName.equals(each1.userName)){
                    System.out.println("Person has both Facebook and Instagram accounts " + each1.userName);
                }
            }
        }


    }
}
