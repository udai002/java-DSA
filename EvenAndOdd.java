import java.util.Scanner;

public class EvenAndOdd {
    //printing even indices and odd indices 
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0 ; i< N ; i++){
            if(i%2 == 0){
                System.out.print(arr[i]);
            }
        }

        System.out.println();

        for(int i =0 ; i< N ; i++){
            if(i%2 != 0){
                System.out.print(arr[i]);
            }
        }
    }
}
