public class StackClass {

    // creating  a node 
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    //creating a stack data structure
    static class Stack{
        public static Node head;

        public boolean isEmpty(){
            return head==null;
        }

        //creating a function to push the elements
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //creating a function to pop the elements
        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // creating a function to peek the element 
        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args){
        Stack s = new Stack();//creating a stack data structre
        //adding elements to stack using push fuction
        s.push(1);
        s.push(3);
        s.push(4);
        s.push(6);
        s.push(8);

        // System.out.println(s.peek());

        //printing and pop all the elements in the stack
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
