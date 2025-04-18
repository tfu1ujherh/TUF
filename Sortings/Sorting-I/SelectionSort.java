import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added:");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // Call Selection Sort function
        selectionSort(nums);

        System.out.println("Array after selection sort:");
        for (int num : nums) { // Enhanced for-loop
            System.out.println(num);
        }

        sc.close();
    }

    public static void selectionSort(int nums[]) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Store index of the smallest element
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
