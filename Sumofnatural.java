public class Sumofnatural {

    public static void SumNatural(int n , int i , int sum){

        if(n==i){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        System.out.println(sum);
        SumNatural(n, i+1, sum);
    }
    public static void main(String [] args){
        SumNatural(5 , 1,0);
    }
}
