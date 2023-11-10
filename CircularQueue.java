public class CircularQueue {

    // creating a queue
    public class Queue{
        static int arr[] ;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size){
             arr  = new int[size];
             this.size = size;
        }

        public boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        public boolean isFull(){
            return (rear+1)%size - 1 == front;
        }

        public static void add(int data){
            
        }



    }
    public static void main(String args []){

    }
}
