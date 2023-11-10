// import java.nio.file.Path;
import java.util.ArrayList;

// import Binarytree.node;

public class RootOfLeafPath {

    static class Node{
        int data ; 
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root , int data){
        if(root == null){
            //
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }

        return root ;

    }

    public static void inOrder(Node root){
        if(root == null){
            return ;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void printPath(ArrayList<Integer> path){
        for (int i=0 ; i < path.size() ; i++){
            System.out.print(path.get(i)+"->");
            
        }
        System.out.println();

    }

    public static  void   rootOfTheLeaf(Node root , ArrayList<Integer> path){
         //to solve this we have to use ArrayList that we can use to store our node data and print the paths
         //preOrder traversing -
         // root (add)
        //  left subtree
        // right subtree
        // Remove

        if(root == null){
            return ;
        }
        path.add(root.data);

        if(root.left == null && root.right ==null){
            printPath(path);
        }
        else{
            rootOfTheLeaf(root.left, path);
            rootOfTheLeaf(root.right, path);

        }

        path.remove(path.size()-1);
        
    }

    // public static void inOrder(Node root){
    //     if(root == null){
    //         return ;
    //     }

    //     inOrder(root.left);
    //     System.out.print(root.data + " ");
    //     inOrder(root.right);
    // }
    public static void main(String[] args) {

        int[] arr = {4,6,3,5,2,1};

        Node root = null;

        for (int i=0 ; i<arr.length ; i++){
            root  = insert(root, arr[i]);
            System.out.print(root.data + " ");
        }

        System.out.println();
        
        inOrder(root);

        System.out.println();

        // ArrayList<Integer> path = new ArrayList<>();

        rootOfTheLeaf(root, new ArrayList<>() );
    }
}
