import java.util.*;

public class StackCollect {

    //push at bottom
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    //reversing the stack
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }


    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        s.push(0);
        s.push(2);
        s.push(3);
        s.push(4);

        // pushAtBottom(20, s);
        reverse(s);

        // s.peek();
        // // System.out.println(s.peek());

        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
