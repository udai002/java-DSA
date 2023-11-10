import java.util.*;

public class Binarytree {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //

    static class BinaryTree {
        static int idx = -1; // this is a variable we define to traverse from all the roots

        public node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }

            node newNode = new node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }
    }

    // preOrder traversing
    public static void preorder(node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    // inOrder traversing -O(n)
    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // postOrder travesing - o(n)
    public static void postorder(node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // level order traversing
    public static void levelOrder(node root) {

        if (root == null) {
            return;
        }

        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            node currNode = q.remove();// here output depends on queue
            if (currNode == null) { // checking if the current node is equal to null
                System.out.println();
                if (q.isEmpty()) { // if there are no other nodes then it will break
                    break;
                } else {
                    q.add(null); // if there are node then we will add null in the queue
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(node root) {

        if (root == null) {
            return 0;
        }

        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);

        return leftNode + rightNode + 1;
    }

    public static int sumOfNodes(node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int height(node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight;
    }

    // time comlexity of diameter -- O(n^2)

    public static int diameter(node root) {
        if (root == null) {
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);

        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam2, diam1));
    }

    // approach -2 to caluculate the diameter

    static class treeInfo {
        int ht;
        int diam;

        treeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static treeInfo diameter1(node root) {

        if (root == null) {
            return new treeInfo(0, 0);
        }
        treeInfo left = diameter1(root.left);
        treeInfo right = diameter1(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1; // here we caluculated height in the same function

        int diam1 = left.diam;
        int diam2 = right.diam;

        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam2, diam1), diam3); // here we caluculated the diameter in the same function

        treeInfo myinfo = new treeInfo(myHeight, mydiam);
        return myinfo;

    }

    

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        node root = tree.buildTree(node);
        System.out.println("Preorder");
        preorder(root);
        System.out.println();
        System.out.println("Inorder");
        inorder(root);
        System.out.println();

        System.out.println("Postorder");
        postorder(root);
        System.out.println();

        System.out.println("level Order");
        levelOrder(root);

        System.out.println();
        System.out.println("count of the nodes : " + countOfNodes(root));

        System.out.println("sum of the nodes :" + sumOfNodes(root));
        System.out.println("height of the tree :" + height(root));
        System.out.println("diameter of the tree :" + diameter(root));
        System.out.println("diameter of the tree :" + diameter1(root).diam);

    }
}
