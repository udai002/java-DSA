public class Node {
    int data;
    Node next;

    Node(int x){
        data = x ;
        next = null ;
    }

    Node insertNode(int data , Node head){
        if(head == null){
            Node temp = new Node(data);
            return temp ;
        }

        head.next = insertNode(data , head.next);
        return head ;

    }

    public static void main(String[] args){
        Node obj = new Node(0);
        Node head = null ;
        head = obj.insertNode(5 , head);

    }
}


