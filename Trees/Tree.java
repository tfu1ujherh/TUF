class tree {
    // Root of the Binary Search Tree
    Node root = null;

    // Inner class representing a node in the BST
    class Node {
        int key;
        Node left, right;

        // Constructor for a new node
        Node(int data) {
            key = data;
            left = right = null;
        }
    }

    // Method to insert a new key into the BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive method to insert a new key into the BST
    Node insertRec(Node root, int key) {
        // Base case: if the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        // Return the unchanged node pointer
        return root;
    }

    // Method to delete a key from the BST
    void delete(int key) {
        root = deleteRec(root, key);
    }

    // Recursive method to delete a key from the BST
    Node deleteRec(Node root, int key) {
        // Base case: if the tree is empty
        if (root == null) {
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: get the inorder successor (smallest in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    // Method to find the minimum value in the BST
    int minValue() {
        return minValue(root);
    }

    // Helper method to find the minimum value node in the subtree rooted at the given node
    int minValue(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return Integer.MIN_VALUE;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.key;
    }

    // Method to find the maximum value in the BST
    int maxValue() {
        return maxValue(root);
    }

    // Helper method to find the maximum value node in the subtree rooted at the given node
    int maxValue(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return Integer.MIN_VALUE;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.key;
    }

    // Method to search for a key in the BST
    Node search(int key) {
        return searchRec(root, key);
    }

    // Recursive method to search for a key in the BST
    Node searchRec(Node root, int key) {
        // Base case: root is null or key is present at root
        if (root == null || root.key == key) {
            return root;
        }

        // Key is greater than root's key
        if (root.key < key) {
            return searchRec(root.right, key);
        }

        // Key is smaller than root's key
        return searchRec(root.left, key);
    }

    // Method to perform preorder traversal of the BST
    void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    // Recursive method for preorder traversal
    void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Method to perform inorder traversal of the BST
    void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    // Recursive method for inorder traversal
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.key + " ");
            inOrderRec(root.right);
        }
    }

    // Method to perform postorder traversal of the BST
    void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    // Recursive method for postorder traversal
    void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    // Method to find the maximum depth (height) of the BST
    int maxDepth() {
        return maxDepthRec(root);
    }

    // Recursive method to find the maximum depth (height) of the BST
    int maxDepthRec(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepthRec(root.left);
        int rightDepth = maxDepthRec(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    // Main method to demonstrate the functionality of the BST
    public static void main(String[] args) {
        tree tree = new tree();
        tree.insert(50);
        tree.insert(60);
        tree.insert(80);
        tree.insert(10);
        tree.insert(20);

        System.out.println("PreOrder Traversal:");
        tree.preOrder();

        System.out.println("InOrder Traversal:");
        tree.inOrder();

        System.out.println("PostOrder Traversal:");
        tree.postOrder();

        System.out.println("Minimum value: " + tree.minValue());
        System.out.println("Maximum value: " + tree.maxValue());

        int key = 80;
        System.out.println("Search for the key " + key);
        Node result = tree.search(key);
        if (result != null) {
            System.out.println("Found " + key);
        } else {
            System.out.println(key + " Key not found");
        }

        System.out.println("Depth of the tree: " + tree.maxDepth());

        System.out.println("Delete key " + key);
        tree.delete(key);
        System.out.println("PreOrder After deleting the Key:");
        tree.preOrder();
    }
}
