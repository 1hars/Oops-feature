package Var_Argument;

public class Calculator {
    public static void main(String[] args){
        addMethod(10,20);
        addMethod(10,20,30,40);
        addMethod(10,40,50);
    }
    public static void addMethod(int ...a){
        int sum = 0;
        for(int x : a){
            sum = sum+x;
        }
        System.out.println(sum);
    }
}
