package day39inharitance_encapsulation.access.c;

import day39inharitance_encapsulation.access.a.Condo;
import day39inharitance_encapsulation.access.a.House;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;


public class condoObject extends  House {


    public static void main(String[]args){


condoObject condoNew = new condoObject();
    condoNew.address = "30 Pine Ash";
   condoNew.city = "Woodbrige";// protected variable from Super class - House, which located in another package
        }

}
