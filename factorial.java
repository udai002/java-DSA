import java.util.Scanner;

public class factorial{
    public static int calcFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact1 = calcFactorial(n-1);
        int fact2 = n*fact1;
        return fact2;
    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int userData = s.nextInt();
        System.out.println(calcFactorial(userData));
    }
}