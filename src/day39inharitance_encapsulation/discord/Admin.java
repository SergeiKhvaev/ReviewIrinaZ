package day39inharitance_encapsulation.discord;

public class Admin extends DiscordUser {
    /*
    Create a class Admin
    - Admin class inherits DiscordUser class
    - create constructor to call parent constructor and set up variables
(role - Admin, name, id)
    - create method:
        createChannel()
            Example output: prints Creating new discord channel
     */

    int adminNum;

    public Admin(String role, String name, double id, int adminNum){
        super(role, name, id);
        this.adminNum = adminNum;
    }

    public void createChannel(){
        System.out.println(name + "is creating new discord channel");
    }

    public String toString() {
        return "Admin{" +
                "adminNum='" + adminNum + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
