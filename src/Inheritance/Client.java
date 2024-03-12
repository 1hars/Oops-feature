package Inheritance;

class Native{
    static{
        System.out.println("Hello");
    }
    public native void m1();
}
public class Client {
    public static void main(String[] args){
            Native n = new Native();
            n.m1();
    }
}
