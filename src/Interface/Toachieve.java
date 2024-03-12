package Interface;

interface inter{
    void m1();
    int x = 10;
}
class E implements inter{
   public void m1(){
        System.out.println("Hello");
       System.out.println(inter.x);
    }

}
public class Toachieve {
    public static void main(String[] args) {
        E e = new E();
        e.m1();
    }


}
