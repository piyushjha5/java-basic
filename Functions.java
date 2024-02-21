import java.util.*;
public class Functions{

    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }

    public static int Sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void Factorial(int a){
        if(a == 0){
            System.out.println("Invalid Number");
            return;
        }
        int result = 1;
        for(int i = a; i>=1; i--){
            result = result * i;
        }
        System.out.println("Factorial of "+a+" is "+result);
        return;
    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name you want to print ");
        String name = sc.next();
        PrintMyName(name);
        System.out.println();

        System.out.print("Enter the first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter the second no. : ");
        int b = sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+Sum(a, b));
        System.out.println();

        System.out.print("Enter the no. you want factorial of ");
        int fact = sc.nextInt();
        Factorial(fact);

    }
}