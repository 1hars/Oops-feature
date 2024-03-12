package Polymorphism;


class C{
    public void m1(){
        System.out.println("hello");
    }
    public void m1(int a){
        System.out.println(a);
    }
    public  void m1(int a, int b){
        System.out.println(a+b);
    }
}
public class Methodoverloded {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m1(10);
        c.m1(10,20);
    }
}
