
public class subTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean isIdentical(Node root , Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }

        if(root == null || subRoot == null){
            return false;
        }

        return isIdentical(root.left, subRoot.left)  || isIdentical(root.right, subRoot.right);
    }

    public boolean isSubTree(Node root , Node subRoot){

        if(subRoot == null){
            return true;
        }

        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        if(root.data == subRoot.data){
            return isSubTree(root.left, subRoot)  || isSubTree(root.right, subRoot);

        }

        return false;
    }
    public static void main(String [] args){

    }
}


// Sum of Nodes at Kth level 
