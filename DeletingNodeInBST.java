public class DeletingNodeInBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data == val) {// here is the data where we have to delete the node
            // case 1 -- NO child
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 -- One child
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // case 3 -- two child
            Node Is = inordersuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);

        } else {
            root.right = delete(root.right, val);
        }

        return root;

    }

    public static Node inordersuccessor(Node root) { // this is used to find left most node .
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // printing the number that are in BST b/w the range X and Y
    public static void printNumInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }
        // case 1 if root lies b/w x and Y
        if (root.data >= X && root.data <= Y) {
            printNumInRange(root.left, X, Y);
            System.out.print(root.data + " "); //there will be only one print statement when we use rescursion
            printNumInRange(root.right, X, Y);
        } else if (root.data >= X && root.data >= Y) { // case 2 if X and Y are less than root
            printNumInRange(root.left, X, Y);
        } else { // case 3 if X and Y are greater than root .
            printNumInRange(root.right, X, Y);
        }

    }

    

    public static void main(String[] args) {
        int[] values = { 4, 5, 3, 2, 7, 1 };

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
            System.out.println(root.data);
        }

        inorder(root);

        delete(root, 4);
        System.out.println();

        inorder(root);
        System.out.println();

        printNumInRange(root, 3, 6);
    }
}
