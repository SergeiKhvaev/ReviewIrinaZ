package day40methodovverriding.devices;

public class RunnincClass {
    /*
    Create a class UseDevice
	create an object of TV and Phone and verify if constructor,
    toString(), and useDevice() are working properly for each class
    List the is a relations of all the classes

     */

    public static void main(String[] args) {

     TV tvSet =   new TV("Sony", "Infinity", 1255.99, true, 58);
        System.out.println(tvSet.UseDevice());
        System.out.println(tvSet);

        System.out.println("=========================");


        Iphone phone = new Iphone("Apple", "14 model", 1550, true, 100);
        System.out.println(phone.UseDevice());
        System.out.println(phone);
        }

    }

