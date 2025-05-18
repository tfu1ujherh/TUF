import java.util.Scanner;

class depthOfaTree {
    TreeNode root;

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

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        depthOfaTree obj = new depthOfaTree();

        System.out.println("Enter the number of elements to be added:");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            obj.insert(val);
        }

        

        System.out.println("In-Order Traversal:");
        obj.inOrder();

        System.out.println("Height of the tree:");
        int result = obj.maxDepth(obj.root); // Corrected this line to reference obj.root
        System.out.println(result);
    }
}







