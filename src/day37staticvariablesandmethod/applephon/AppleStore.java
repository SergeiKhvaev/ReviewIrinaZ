package day37staticvariablesandmethod.applephon;

import javax.sound.midi.Soundbank;

public class AppleStore {
    public static void main(String[] args) {
        System.out.println(Iphone.brand);// вызвали статик вариабле без создания объекта



        Iphone iphon1 = new Iphone("Iphon X", "Black", 1000, 256);
        System.out.println(iphon1);

        System.out.println(Iphone.brand);
        System.out.println(Iphone.os);
// мы могли бы вызвать статик вариаблес через объект, но лучше исопольхзовать вызов через имя класса

        System.out.println("=========================");
        // статик блокне запуститься снова, он вызывается только один раз, при создании первого объекта

        Iphone iphone7 = new Iphone("Iphon 7", "Silver", 1200, 128);
        System.out.println(iphone7);
    }




}
