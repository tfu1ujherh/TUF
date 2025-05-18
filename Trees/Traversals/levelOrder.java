import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class levelOrder {

    TreeNode root;

    // Definition of TreeNode class
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Insert method
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data > root.data) {
            root.right = insertRec(root.right, data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        }
        return root;
    }

    // In-order traversal
    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    // Level order traversal
    public void levelOrder() {
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        System.out.println("Level Order Traversal:");
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        levelOrder obj = new levelOrder();

        System.out.println("Enter the number of elements to add:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            obj.insert(value);
        }

        System.out.println("In-Order Traversal:");
        obj.inOrder();

        // Perform level order traversal
        obj.levelOrder();

        sc.close();
    }
}
