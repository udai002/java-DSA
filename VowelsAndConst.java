import java.util.Scanner;

public class VowelsAndConst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        //to convert any String into char we have to put .charAt(0)
        boolean result = false;

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (char a : vowels) {
            if (c == a) {
                result = true;
            }

        }

        if (result) {
            System.out.println("VOWELS");
        } else {
            System.out.println("CONSTANTS");
        }
    }
}
