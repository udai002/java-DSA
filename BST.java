public class BST {

    static class Node{
        int data;
        Node left;
        Node right ;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }


    // creating a function to inert nodes into binary tree
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root ;
        }

        if(root.data > val){
            //we have to insert it into left subtree
            root.left =  insert(root.left, val);// here we are assigning a value for the null node using recursion
            // here it works like when we call the insert function itself it checks null value if it is null then it insert the value to the null itself
        }else{
            root.right = insert(root.right, val);
        }

        return root; 
    }

    public static void inOrder(Node root){
        if(root == null){
            return ;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");// here we get sorted nodes
        inOrder(root.right);
    }

    // public static void searchBST(Node root , int key){

    //     if(root.data == key){
    //         System.out.println("we found the key");
    //     }

    //     if(key < root.data){
    //         searchBST(root.left, key);
    //     }else{
    //         searchBST(root.right, key);
    //     }
    // }

    public static boolean search(Node root , int key){

        if(root == null){
            return false;
        }

        if(key < root.data){
            return search(root.left, key);
        }else if(key == root.data){
            return true;
        }else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };

        Node root = null ;

        for(int i = 0 ; i < values.length ; i++){
            root = insert(root, values[i]);
            System.out.println(root.data);
            // System.out.println(values[i]);
        }

        inOrder(root);
        System.out.println();
        System.out.print(search(root, 9));
    }
}
