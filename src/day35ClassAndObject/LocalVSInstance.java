package day35ClassAndObject;

public class LocalVSInstance {

    // a and b are instance variables
    int a = 5;
    int b = 10;

    public LocalVSInstance (int a,  int z){ // a and z here are local variables

      a = a;// local is pririotized, whitch you are reassigning the local variable to itself, but that means the instance a did nor change (solution is use keyword "this"
        b = z;
    }
        public void print(){
            System.out.println(a);

        }

    public static void main(String[] args) {
        LocalVSInstance obj = new LocalVSInstance(20, 50);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
