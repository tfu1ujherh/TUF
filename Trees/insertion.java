import java.util.Scanner;

public class insertion {
     TreeNode root;

    // Make TreeNode a static nested class
      class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        // Constructor to initialize a new node
         TreeNode(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    // Method to insert a value into the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive helper method to insert a value into the BST
    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value > root.value) {
            root.right = insertRec(root.right, value);
        } else if (value < root.value) {
            root.left = insertRec(root.left, value);
        }

        return root;
    }

    // Method to perform an inorder traversal of the BST
    public void inOrder() {
        inOrder(root);
        System.out.println(); // Print a newline after traversal
    }

    // Recursive helper method for inorder traversal
    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " "); // Print on the same line
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        insertion obj = new insertion();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of values you want to insert:");
        int n = scanner.nextInt();

        System.out.println("Enter the values to insert into the BST:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            obj.insert(value);
        }

        // Perform inorder traversal
        System.out.println("Inorder Traversal of the BST:");
        obj.inOrder();

        scanner.close();
    }
}
