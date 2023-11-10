import java.util.ArrayList;

public class ArrayStack {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }

        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(0);
        s.push(2);
        s.push(4);
        s.push(6);

        // System.out.print(s.peek());

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
