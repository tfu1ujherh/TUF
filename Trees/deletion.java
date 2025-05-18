import java.util.Scanner;

public class deletion {
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

    // Deletion
    public void delete(int data) {
        if (!find(root, data)) {
            System.out.println("Value " + data + " is not present in the tree.");
        } else {
            root = deleteRec(root, data); // Assign the updated root
            System.out.println("Value " + data + " deleted successfully.");
        }
    }

    private TreeNode deleteRec(TreeNode root, int data) {
        if (root == null) {
            return null; // Base case: Node not found
        }

        // Traverse the tree to find the node to delete
        if (data < root.value) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.value) {
            root.right = deleteRec(root.right, data);
        } else {
            // Node found

            // Case 1: Node has no left child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Node has no right child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Node has two children
            // Replace the node's value with the inorder successor (smallest in the right subtree)
            root.value = minVal(root.right).value;

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value);
        }

        return root; // Return the updated root
    }

    // Find the minimum value in a subtree
    private TreeNode minVal(TreeNode root) {
        while (root.left != null) {
            root = root.left; // Go to the leftmost node
        }
        return root; // Leftmost node is the minimum
    }

    // Check if a value exists in the tree
    public boolean find(TreeNode root, int data) {
        if (root == null) {
            return false;
        }

        if (data < root.value) {
            return find(root.left, data);
        } else if (data > root.value) {
            return find(root.right, data);
        } else {
            return true; // Value found
        }
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
        deletion obj = new deletion();
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

        System.out.println("Enter the value to delete:");
        int valueToDelete = scanner.nextInt();
        obj.delete(valueToDelete);

        System.out.println("Tree after deletion of the key:");
        obj.inOrder();

        scanner.close();
    }
}
