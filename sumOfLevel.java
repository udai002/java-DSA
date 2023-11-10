import java.util.LinkedList;
import java.util.Queue;

public class sumOfLevel {

    // we have to caluculate the sum of element in given level

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {

            this.data = data;
            this.left = null;
            this.right = null;

        }

    }

    public static void levels(Node root) {

        int sum = 0;
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }

                sum += currNode.data;
            }

        }

        // i have to be more accurate and be smart to do this -- take a long breath ,
        // think about the topic and logic and start typing....
    }

    static class buildTree {
        static int idx = -1;

        Node buildTree(int[] arr) {
            idx++;
            if (arr[idx] == -1) {
                return null;
            }

            Node tree = new Node(arr[idx]);
            tree.left = buildTree(arr);
            tree.right = buildTree(arr);

            return tree;
        }
    }

    public static int sumOfKth(int k, Node root) {
        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int level = 0;

        int sum = 0;

        int flag = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {  //this is respomsible for removing all the elements from the level 
                Node ptr = q.remove();

                if (level == k) {
                    flag = 1;

                    sum += ptr.data;
                } else {
                    if (ptr.left != null) {
                        q.add(ptr.left);
                    }

                    if (ptr.right != null) {
                        q.add(ptr.right);
                    }
                }
                
                
            }
            level++;

            if (flag == 1)
                break;

            }
            return sum;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        buildTree tree = new buildTree();
        Node root = tree.buildTree(arr);

        levels(root);
        System.out.println(sumOfKth(2, root));

    }
}
