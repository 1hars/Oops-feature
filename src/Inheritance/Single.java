package Inheritance;


class Sing{
    String address;
    Sing(String address){
        this.address = address;
    }
}
class Singchild extends Sing{
    String des;
    String name;
    Singchild(String name, String address,String des){
        super(address);
        this.name = name;
        this.des = des;
    }
}
class Heri extends Singchild{
    Heri(String des, String name,String address){
        super(des,name,address);
    }

}
public class Single {
    public static void main(String[] args) {
         Heri her = new Heri("Software developer","Ankit","D-128");

    }
}
