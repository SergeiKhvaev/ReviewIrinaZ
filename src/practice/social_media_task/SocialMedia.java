package practice.social_media_task;

public abstract class SocialMedia {
/*
Social Media
• Create an abstract class SocialMedia
• The SocialMedia class will have the following fields:
 - Personal url (String)
 - Account length (int)
 - Platform (static String)
- Username
- Password
- Full name
• The SocialMedia class will have the following abstract methods:
 - Direct messaging (String username, String message)
 - Post (Object media)   [using Object type as the parameter]
 - Notifications ()
 */


    String personalURL;
    int accountLength;
    static String platform;
    String userName;
    String password;
    String fullName;





    public abstract void directMessaging(String username, String message);

    public abstract void Post (Object media);// use Object type as parameter

    public abstract void notification();






}
