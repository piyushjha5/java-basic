import java.util.*;
public class LeapYear {

    public static void leapyear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year+" is a leap year");
            return;
        }
        else {
            System.out.println(year+" is not a leap year");
            return;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        leapyear(year);
    }
}