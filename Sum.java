import java.util.*;
public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("Sum of the two numbers is : "+sum);
    }
}