import java.util.*;
public class Array2D{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Q> Taking array input and printing the array.");
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        System.out.println("Enter the elements of the array ");

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                   System.out.print(numbers[i][j]+" ");
                }
                System.out.println();
            }

        System.out.println("Q> Take the matrice as input from the user. Search for a given number x and print the indices at which it occurs.");

        System.out.print("Enter the number you want to search: ");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j]==x){
                    System.out.println(x+" is at index of ("+i+", "+j+")");
                }
            }
        }

        System.out.println("Q> Print Transpose the matrix.");

        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Q> Print the spiral order matrix as output for a given matrix of numbers.");

        /*
        int rstart = 0;
        int rend = rows-1;
        int cstart = 0;
        int cend = cols-1;

        while (rstart<=rend && cstart<=cend) {

            for(int i = cstart; i<=cend; i++){
                System.out.print(numbers[rstart][i]+" ");
            }
            rstart++;

            for(int i = r)
        }
        */

    }
}