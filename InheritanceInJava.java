class Caluculation{

    public int add(int x , int y){
        return x + y;
    }

    public int subtraction(int x , int y){
        return x - y;
    }
}

class My_calculation extends Caluculation{

    public int muliplication(int x , int y){
        return x*y ;
    }

    public int division(int x , int y){
        return x/y;
    }
}


public class InheritanceInJava {
    public static void main(String[] args) {
        My_calculation obj = new My_calculation();
          
        
           
        
        System.out.println( obj.add(23, 45));
        System.out.println(obj.subtraction(23, 45));
        System.out.println(obj.muliplication(23, 45));
        System.out.println( obj.division(23, 45));
    }
}
