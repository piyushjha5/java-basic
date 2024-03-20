import java.util.*;
public class AreaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle : ");
        int radius = sc.nextInt();
        double area = 3.14 * Math.pow(radius, 2);
        System.out.println("Area of a Circle is : "+area);
    }
}  