import java.util.*;

public class Strings{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String yourname = sc.nextLine();
        System.out.println("Your name is "+ yourname);

        String firstname = "Piyush";
        String secondname = "Jha";

        //Concatination: It adds both the strings
        String fullname = firstname+" "+secondname;
        System.out.println(fullname);

        //string.length() function is used to calculate the length of the string
        System.out.println("Length of the string is "+fullname.length());

    }
}