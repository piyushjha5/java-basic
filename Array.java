import java.util.*;
public class Array{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        /*
        a.  Creating an Array (method 1)- new keyword   
            int[] marks = new int[3];
            marks[0] = 97;
            marks[1] = 98;
            marks[2] = 95;

        b.	Creating an Array (method 2)
            int[] marks = {98, 97, 95};
        */

        System.out.println("Take an array as an input and printing its elements");
        System.out.print("Enter size of the arrray : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        //print the numbers in array
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        System.out.println("Take an array of names as input from the user and print then on the screen");
        System.out.print("Enter size of the arrray of names: ");
        int size2 = sc.nextInt();
        String names[] = new String[size];

        //input
        for(int i=0; i<size2; i++) {
           names[i] = sc.next();
        }
     
        //output
        for(int i=0; i<names.length; i++) {
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }

    }
}