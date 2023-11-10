// import java.util.*;

public class Recusivenum{

    public static void printNum(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String [] args){
        printNum(1);
    }
}