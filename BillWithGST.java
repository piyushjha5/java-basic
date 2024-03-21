import java.util.*;
public class BillWithGST {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of eraser : ");
        float eraser = sc.nextFloat();

        float bill = pencil+pen+eraser;
        System.out.println("Bill of the items : "+bill);
        float GST = ((pencil+pen+eraser)*18)/100;
        System.out.println("Bill of the items with GST : "+(bill+GST));
    }
}