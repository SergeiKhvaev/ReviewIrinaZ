package day24Arrays;

import java.util.Arrays;

public class ArrayPracticeSelf {
    public static void main(String[] args) {

       /*
       Given two values:
	app = "google"
	& zone = "us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1"

deploy the app to each zone. Each zone is seperated by the # character

	Ex:
		Deploying etsy to us-east-1...
		Deployment completed for us-east-1

		Deploying etsy to us-west-1...
		Deployment completed for us-west-1

		etc...
        */
String zone = "us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1";
String [] zoneArray = zone.split("#");
        System.out.println(Arrays.toString(zoneArray));

        String deploying ="Deploying etsy to ";
        String deployment = "Deployment completed for ";

for(int i = 0; i < zoneArray.length; i ++){
    System.out.println(deploying += zoneArray[i]);
    System.out.println(deployment += zoneArray[i]);
    System.out.println("------------------------");
    deploying ="Deploying etsy to ";
     deployment = "Deployment completed for ";

}

        System.out.println("======================= by zones");


       // String zone = "us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1";

        String usEast ="";
        String usWest = "";
        String euEast = "";
        String euWest ="";
for(String each : zoneArray){
    if(each.contains("us-east")){
        usEast += each;
    }else if  (each.contains("us-west")){
        usWest += each;
    }else if (each.contains("eu-east")){
        euEast += each;
    }else if (each.contains("eu-west")){
        euWest += each;
    }
}
        System.out.println("Deploying etsy to " + usEast + "\n" + "Deployment completed for " + usEast);
        System.out.println();
        System.out.println("Deploying etsy to " + usWest + "\n" + "Deployment completed for " + usWest);
        System.out.println();
        System.out.println("Deploying etsy to " + euEast + "\n" + "Deployment completed for " + euEast);
        System.out.println();
        System.out.println("Deploying etsy to " + euWest + "\n" + "Deployment completed for " + euWest);



    }




}
