package Encapsulation;

class A{
    private String name;
    private int val;
    private int roll;

    public A(String name, int val, int roll) {
        this.name = name;
        this.val = val;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        if(val == 0) {
            this.val = 100;
        }
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void dispaly(){
        System.out.println(name+"\t"+val+"\t"+roll);
    }
}
public class ExampleEn {
    public static void main(String[] args) {
        A a = new A("harsh",0,22);
        a.dispaly();
    }
}
