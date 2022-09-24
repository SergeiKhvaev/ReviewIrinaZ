package day36classandobject.offerself;

import day36classandobject.offer.offer;

import java.util.ArrayList;

public class MarketSelf {
    public static void main(String[] args) {
        /*
        Create a separate class to create and test the Offer objects
            create multiple Offer objects and store them into an ArrayList of Offers.
    Create multiple other Lists to filter out different information:
    write a program that can only keep the offers from local area
    write a program that can remove all offers that are not for SDET or QA
    write a program that can remove the offers that are not full Time
    write a program that removes all offer that are less than 100,000 salary
        - Find the biggest and lowest salary Offers and print the whole object
         */
        ArrayList<OfferSelf> jobs = new ArrayList<>();// ������ ������ ���������
        OfferSelf amazon = new OfferSelf("Amazon","Virginia", 125000, true, 12); // instanciete class

        System.out.println(amazon);
        jobs.add(amazon);// �������� � ���� ������? ����� ��������� ������ ������ - ������
        System.out.println(jobs);
        jobs.add(new OfferSelf("Google" , "Ohaio", 137000, false, 2));// �������� � ��������� ����� �, ������� ������� ����� � ������ add
        jobs.add(new OfferSelf("Meta", "Florida", 159000, true, 12));
        jobs.add(new OfferSelf("Apple", "Florida", 110000, true, 18));
        jobs.add(new OfferSelf("Nasa", "Washington", 180000, false, 8 ));

/*
write a program that can only keep the offers from local area
    write a program that can remove the offers that are not full Time
    write a program that removes all offer that are less than 100,000 salary
        - Find the biggest and lowest salary Offers and print the whole object
 */
        System.out.println("============================");
      //  write a program that can only keep the offers from local area
        ArrayList<OfferSelf> localCompany = new ArrayList<>(jobs); // c������ ����� ����(����� ��������), ����� �������� � ���� �������� ���������, �� ������� ����������� ����
        localCompany.removeIf(p -> !p.location.equals("Florida"));//����������� ������, ��� �� ������� ��� �������, ����� �������. ������ � instance variable location ��������� ��������� ���������
        System.out.println(localCompany);

        System.out.println("============================");

//  write a program that can remove the offers that are not full Time
        ArrayList<OfferSelf> fullTime = new ArrayList<>(jobs);
        for(OfferSelf eachElement : fullTime){  // ������������ ������� for each loop
            if(eachElement.isFullTime){
                System.out.println(eachElement);
            }
        }
        System.out.println("============================");
        //  write a program that removes all offer that are less than 100,000 salary
        ArrayList<OfferSelf> smallestSalaryList = new ArrayList<>(jobs);
smallestSalaryList.removeIf(pf -> pf.salary < 135000);
        System.out.println(smallestSalaryList);
//smallestSalary.forEach(eachElement -> System.out.println(eachElement));

        System.out.println("==========================");
       // Find the biggest and lowest salary Offers and print the whole object
        ArrayList<OfferSelf> smallestAndBiggestSalary = new ArrayList<>(jobs);

        double smallestSalary = smallestAndBiggestSalary.get(0).salary; //���������� �� ���������, ��� ����� ��������� �� ��������� � �������, ������� ��������� ��� �������� 0 � �����
        double biggestSalary = smallestAndBiggestSalary.get(0).salary;//���������� �� ���������, ��� ����� ��������� �� ��������� � �������, ������� ��������� ��� �������� 0 � �����
        OfferSelf max = smallestAndBiggestSalary.get(0); // ����� ������� ��������� � ����� ��� �������� 0 �� ��������� ����������
        OfferSelf min = smallestAndBiggestSalary.get(0); // �����, ������� ��������� � ����� ��� �������� 0 �� ��������� ����������

        for(OfferSelf eachElement : smallestAndBiggestSalary){
            if(eachElement.salary > smallestSalary){
                biggestSalary = eachElement.salary;
                max = eachElement;
            }
            if(eachElement.salary < smallestSalary){
                smallestSalary = eachElement.salary;
                min = eachElement;
            }
        }
        System.out.println("Smallest salary - &" + smallestSalary);
        System.out.println("Smallest offer - " + min);
        System.out.println("Biggest salary - $" + biggestSalary);
        System.out.println("Biggest offer - " + max);



    }
}
