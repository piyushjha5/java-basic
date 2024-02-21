public class Pattern{
    public static void main(String args[]){


        System.out.println("Square Patter");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("Hollow Square");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
        System.out.println("Right Angled Triangle");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("Inverted Pyramid");
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted Pyramid");
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Half number pyramid");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Inverted Half number pyramid");
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Floyd's Triangle");
        int flag=1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(flag+"  ");
                flag++;
            }
            System.out.println();
        }
        
        System.out.println("0-1 Triangle");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}