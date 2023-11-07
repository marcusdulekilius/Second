import java.util.*;

public class arraymaker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                int num=0;
                System.out.print("Enter the element of A[" + i + "][" + j + "]: ");
            A[i][j]= scanner.nextInt(); 
            }
            
        }
        System.out.print("Here is your A[3][2] array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(" " + A[i][j]);
            }
            
        }
    }
}
