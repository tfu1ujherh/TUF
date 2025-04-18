import java.util.Scanner;

class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added:");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // Call Insertion Sort function
        insertionSort(nums);

        System.out.println("Array after insertion sort:");
        for (int num : nums) { // Enhanced for-loop
            System.out.println(num);
        }

        sc.close();
    }

    public static void insertionSort(int nums[]) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            // Move elements that are greater than key one position ahead
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key; // Insert key at the correct position
        }
    }
}
