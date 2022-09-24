package practice.social_media_task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    /*
Post class
• Create a class that has the following instance variable:
 String body, and String dateTime
 - Encapsulate body. Provide a public getter and setter
 - Make dateTime final, private, read only (getter, but no setter)
• Create a constructor that will take and initialize the body instance variable.
Upon creation of the post the current date and time should be taken and
stored into the dateTime variable. Use the code given below
Note: Since we didn’t learn this class use the follow code:
     this.dateTime =
LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy
| hh:mm a"));
? Need to have these two imports for the above code:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

     */
    private String body;
    private final String dataTime;




    public Post(String body){
        this.body = body;
        this.dataTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a")); // final variable inicialization automaticali by using LocalDataTime.now().format(DataTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a")) by using that method, basicaly method define current time and prividet it in given format

    }

    public Post(){
        this.dataTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a")); // final variable inicialization automaticali by using LocalDataTime.now().format(DataTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a")) by using that method, basicaly method define current time and prividet it in given format
    }

    public String getBody(){
        return body;
    }

    public void setBody(){
        this.body = body;
    }

    public String getDataTime(){
        return dataTime;

    }
}
