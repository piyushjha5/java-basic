import java.util.*;
public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first operand : ");
        int a = sc.nextInt();
        System.out.print("Enter second operand : ");
        int b = sc.nextInt();
        System.out.print("Enter Arithmatic Operator : ");
        char O = sc.next().charAt(0);
        switch(O) {
            case '+': System.out.println(a+b);
                    break;  
            case '-': System.out.println(a-b);
                    break;   
            case '*': System.out.println(a*b);
                    break; 
            case '/': System.out.println(a/b);
                    break;
            case '%': System.out.println(a%b);
                    break;
            default : System.out.println("Wrong Operator");           
        }
    }
}