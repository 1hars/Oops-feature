package Polymorphism;

class A{
    public void broke(){
        System.out.println("Wow");
    }
}
class B extends A{
    public void broke(){
        System.out.println("Kya");
    }
}
public class Methodoverrlod {
    public static void main(String[] args) {
        B b = new B();
        b.broke();
    }
}
