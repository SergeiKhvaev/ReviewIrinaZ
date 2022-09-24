package practice.social_media_task;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements Pictures {
    /*
    Instagram Class:
• Create a class Instagram that will inherit the SocialMedia class
• Add additional instance variables: number of followers, number of
followings, and pictures (ArrayList of Pictures)
• Set the platform for all objects to be "Instagram"
• Encapsulate the variables
• Create a constructor to initialize the username and password
 - Set up the user's person url:
  "Instagram.com/" + $username
• Implement all the abstract methods coming from the Social Media class
o Direct messaging (String username, String message)
 - print = %message sent to %username
o Post (Object body)
 - Let’s keep it simple and say our variable body will be a picture)
  Add the picture object
o Notifications ()
- Checks the current time. If the time is between 10 am - 8 pm print "Notification",
otherwise print "Sleep mode"
 Note: use this code to get the current hour: LocalTime.now().getHour()
- The return value will be given in 24 hour format.
     */

    private int numberOfFolowers;
    private int numbetOfFolowings;
    private ArrayList<Picture> pictures;

    static{
        platform = "Instagram";
    }

    public int getNumberOfFolowers() {
        return numberOfFolowers;
    }

    public void setNumberOfFolowers(int numberOfFolowers) {
        this.numberOfFolowers = numberOfFolowers;
    }

    public int getNumbetOfFolowings() {
        return numbetOfFolowings;
    }

    public void setNumbetOfFolowings(int numbetOfFolowings) {
        this.numbetOfFolowings = numbetOfFolowings;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }

    public Instagram(String userName, String password){
        this.userName = userName;
        this. password = password;
        this.personalURL = "Instagram.com/" + userName;
    }


    @Override
    public void directMessaging(String username, String message){
        System.out.println(message + " sent to " + username);

    }

    @Override
    public void Post(Object body){
        byte[] arr = new byte[3];
    Picture picture = new Picture(arr, "jpg,", "Caption");
    pictures.add(picture);

    }
    @Override
    public void notification(){

        int currentTime = LocalTime.now().getHour();
        if(currentTime > 10 && currentTime < 20){
            System.out.println("Notification");
        } else {
            System.out.println("Sleep time");
        }
    }
    @Override
    public void likePicture(){
        System.out.println("Like Instagram picture");

    }
    @Override
    public void unlikePicture(){
        System.out.println("Unlike Instagram picture");
    }

    @Override
    public void sharePicture(){
        System.out.println("Share Instagram picture");
    }


    @Override
    public String toString() {
        return "Instagram{" +
                "numberOfFolowers=" + numberOfFolowers +
                ", numbetOfFolowings=" + numbetOfFolowings +
                ", pictures=" + pictures +
                ", personalURL='" + personalURL + '\'' +
                ", accountLength=" + accountLength +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

