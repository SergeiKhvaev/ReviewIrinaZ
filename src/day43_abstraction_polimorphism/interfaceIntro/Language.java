package day43_abstraction_polimorphism.interfaceIntro;

public interface Language {
    // interface can not has objects// interface can not be instanciate

    // because interface is not class there is no inheritance, but it is looks like inheritanse when we overide abstract method

    public abstract void hello();// methods in interface are public abstract by default
    void bye(); // it is public abstract methods by default in interface file// in interface we can. but do not have to use public abstract key words
}
