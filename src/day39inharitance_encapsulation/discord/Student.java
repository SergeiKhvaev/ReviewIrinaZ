package day39inharitance_encapsulation.discord;

public class Student extends DiscordUser {
    /*
    Create a class Student
    - Student class inherits DiscordUser class
    - create constructor to call parent constructor and set up variables (role - Student, name, id)
    - create method:
        sendMessage()
            Example output: prints Sending message to class chat
     */

    int studentNum;

    public Student (String role, String name, double id, int studentNum){
        super(role, name, id);
        this.studentNum = studentNum;
    }
    public void sendMessage(){
        System.out.println(name + " is sending massages to class chat");
    }

    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", role = " + role + '\'' +
                ", name = " + name + '\'' +
                ", id = " + id +
                '}';
    }
}
