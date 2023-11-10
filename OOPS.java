import bank.*;
// import bank.Bank;

// there are four pillars of Oops -
    // inheritence -- one class equire properties of another class
    // polymorphism -- many ways to do the work 
        // function overloading -- same name different arguments same class
        // function overiding -- same name same arguments different class
    // abstraction - it can be achived in two ways - Abstract class  , interfaces
    //encapsulation  - data hiding + encapsulation

    // interface - Similar to abstract class , but call methods as Absract methods . it hass 100% abstrct methods


class pen{
    String color ; 
    String type ;

    public void write(){
        System.out.println("values are asigned");
    }

    public void printColor(){
        System.out.println("color of the pen: "+ this.color);
    }
    
    // parametrised constructor
    pen(String color , String type){
        this.color = color;
        this.type = type;
        System.out.println("please wait...");
    }

    //Copy constrictor
    pen(pen p){
        this.color = p.color;
        this.type = p.type;
    }

    pen(){

    }
    
}

public class OOPS{
    public static void main(String[] args){
        pen pen1 = new pen("red" , "gel");
        
       bank.Bank b1 = new Bank();
       
         

        pen1.write();
        pen1.printColor();

        pen pen2 = new pen(pen1);
        pen2.printColor();

    }
}