import java.util.*;

public class copycat {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements do you want to be in your list?: ");
        int size = scanner.nextInt();
        int[] A = new int[size];
        for (i = 0; i < size; i++) {
            System.out.print("Enter the "+(i+1)". element: ");
            A[i] = scanner.nextInt();
        }
        int[] B = new int[size];
        System.out.println("Array A[] successfully copied to B[], here you go: ");
        for (i = 0; i < size; i++) {
            B[i] = A[i];
        }
        for (i = 0; i < size; i++) {
            System.out.print("A[" + i + "] = " + A[i] + " ");
        }
        System.out.println();
        for (i = 0; i < size; i++) {
            System.out.print("B[" + i + "] = " + B[i] + " ");
        }
        scanner.close();
    }
}
