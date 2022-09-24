package day43_abstraction_polimorphism.car;

public class BMW extends Car{

    @Override
    public void Start() {
        System.out.println("press the button to start");
    }
        public void Start(int a){
            System.out.println("statr" +a);
        }


    }

