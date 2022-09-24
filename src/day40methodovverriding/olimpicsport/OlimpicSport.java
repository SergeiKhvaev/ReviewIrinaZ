package day40methodovverriding.olimpicsport;

public class OlimpicSport {
    /*
    Create a class OlympicSport
	instance variables
		- name (String)
		- participants (int)
	constructor:
		- initialize all fields
	methods:
		- compete(), toString()
		override compete in sub classes
Create a class Surfing
	child class of OlympicSport
	constructor: set name and participants variables
	methods:
		compete(): Print Surfing the waves
Create a class Track
	child class of OlympicSport
	constructor: set name and participants variables
	methods:
		compete(): Print Track for running, jumping, throwing
Create a class Soccer
	child class of OlympicSport
	constructor: set name and participants variables
	methods:
		compete(): Print Playing a soccer game
     */
    String name;
    int participant;

    public OlimpicSport(String name, int participant){
        this.name = name;
        this.participant = participant;
    }

    public String compete(){
        return "";
    }

    @Override
    public String toString() {
        return "OlimpicSport{" +
                "name= " + name  +
                ", participant = " + participant;
    }
}
