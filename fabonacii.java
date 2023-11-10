import java.util.Scanner;

public class fabonacii {

    public static long fab(int n){
        if(n <= 1){
            return n;
        }

    
        return fab(n-1) + fab(n-2) ;
    }
    public static void main(String[] args) {
        System.out.print("Enter number to print fabonacii : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fab(n));


    }
}
