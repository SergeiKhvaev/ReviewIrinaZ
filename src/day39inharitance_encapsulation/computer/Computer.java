package day39inharitance_encapsulation.computer;

public class Computer {

    String os;
    int memory;

    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}
