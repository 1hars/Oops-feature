package D;
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int arr[][] = new int[nr][nc];
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                arr[r][c] = scn.nextInt();
            }
        }
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                System.out.print(arr[r][c]+"\t");
            }
            System.out.println();
        }

    }
}
