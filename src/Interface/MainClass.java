package Interface;


interface A{
    void m1();
    void m2();
}
interface C{
    void m3();
    void m4();
}
class B implements A,C{
    public void m1(){
        System.out.println("hello");
    }
    public void m2(){
        System.out.println("How are you");
    }
    public void m3(){
        System.out.println("JAva");
    }
    public void m4(){
        System.out.println("Learner");
    }
}
public class MainClass {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();
        b.m3();
        b.m4();
    }
}
