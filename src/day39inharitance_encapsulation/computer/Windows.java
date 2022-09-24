package day39inharitance_encapsulation.computer;

public class Windows extends Computer{

    public Windows(int memory){
        super("Windows" , memory);// we did like that, because all Windows has os - Windows
    }
}
