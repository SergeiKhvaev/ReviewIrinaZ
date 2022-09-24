package day43_abstraction_polimorphism.interfaceIntro2;

import javax.sound.midi.Soundbank;

public class RunInterface {
    public static void main(String[] args) {

        Desctop obj = new Desctop();
        obj.turnOn(); // implemented abstract method
        obj.typing(); // default method from interface, accesse by object
       // obj.getBrand();// I cant access to static members from classes that implement interface
        // only access static members of interface by interface

        Mac.getBrand();
        //Mac.typing// no accesss to default interface method by name of Interface
    }
}
