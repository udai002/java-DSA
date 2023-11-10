import java.util.Scanner;

public class BitManiplation {
    public static void main(String args[]) {
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;

        // Finding the bit in the given position
        // if((bitmask & n) == 0){
        // System.out.println("bit was zero");
        // }else{
        // System.out.println("bit was one");
        // }

        // setting the bit
        // int newNumber = bitmask | n;
        // System.out.print(newNumber);

        // clear the bit at the position
        // int notBitmask = ~(bitmask);
        // int newMask = notBitmask & n;
        // System.out.println(newMask);

        try (Scanner sc = new Scanner(System.in)) {
            int userEntry = sc.nextInt();

            if (userEntry == 1) {
                int newNumber = bitmask | n;
                System.out.print(newNumber);
            } else {
                int notBitmask = ~(bitmask);
                int newMask = notBitmask & n;
                System.out.println(newMask);
            }
        }

    }
}
