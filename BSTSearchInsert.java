public class BSTSearchInsert {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BST {
        public static Node insert(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                // System.out.println("here we are inserting a new node" + root.val);
                return root;
            }
            
            if (root.val > data) {
                root.left = insert(root.left, data);//here we have to insert node on the root.left if not then it will insert into the root element 
                // System.out.println("here we are inserting a Node on left side");
            } else if (root.val < data) {
                root.right = insert(root.right, data);
                // System.out.println("here we are inserting a new Node on Right side");

            }

            return root;

        }

        public static void inOrder(Node root) {
            if (root == null) {
                // System.out.println("this is a null node");
                return;
            }

            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }

        public static boolean search(Node root, int data) {
            if (root == null) {
                return false;
            }

            if (root.val > data) {
                return search(root.left, data);
            } else if (root.val == data) {
                return true;
            } else {
                return search(root.right, data);
            }
            // return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 4, 2, 7 };

        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = BST.insert(root, arr[i]); // here we have to insert the element and assign it to root .
            // System.out.print(root.val + " ");
        }
        System.out.println();

        BST.inOrder(root);

        System.out.println();

        if (BST.search(root, 3)) {
            System.out.println("data found ");
        } else {
            System.out.println("data Not found");
        }
    }
}
