package D;

public class String1 {
    public static void main(String[] args){
        String str = "Hello are you";
        String[] gtr = str.split(" ");
        for(int i = 0; i < gtr.length; i++ ){
            System.out.println(gtr[i]);
        }
    }
}
