import java.util.*;

public class Circulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of your circle: ");
        float r = scanner.nextFloat();
        float area = (float) (Math.PI * r * r);
        float circumference = (float) (2 * Math.PI * r);
        System.out.printf("Area of the circle is: %.2f%nCircumference of the circle is: %.2f%n", area, circumference);
       scanner.close();
    }
}
