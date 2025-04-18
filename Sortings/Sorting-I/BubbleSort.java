import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added:");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // Call Bubble Sort function
        bubbleSort(nums);

        System.out.println("Array after bubble sort:");
        for (int num : nums) { // Enhanced for-loop
            System.out.println(num);
        }

        sc.close();
    }

    public static void bubbleSort(int nums[]) {
        int n = nums.length;
        boolean swapped; // Optimization flag

        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset flag for each pass

            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap elements
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true; // Set flag if swap occurs
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped) break;
        }
    }
}
