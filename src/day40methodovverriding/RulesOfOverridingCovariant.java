package day40methodovverriding;

public class RulesOfOverridingCovariant {

}

class A{

    public int getNum(){
        return 5;
    }

     String getName(){ // default access modifyer
        return "Sergei";
    }


    // covariant example
    public A get(){ // that method should return A object (break it down: instance method with public access, A - type (return type - A object type)     get - name, () - parameters)
        return new A(); // return Object type A,т.е. вернет non primitive A object of A class.
    }

}


class B extends A{
@Override
    public int getNum(){ // we can t change name, can t change parameter(we can t add it if parameter not exist in method of Super class)
        return 5;
    }
}


class C extends A{

@Override
  public String getName(){ // weable to change access modifyer to more accessable (change to protected or public, because it more visiable then default)
        return "Sergei";
    }

}

class D extends A{

    @Override
    public B get(){ // we can keep return type the same or change to covariant: sub class of that return type - B, C,D, B
        return new B();
    }

}