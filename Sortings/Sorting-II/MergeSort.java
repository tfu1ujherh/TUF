import java.util.Scanner;

class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be added:");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // Call Merge Sort function
        mergeSort(nums,0,nums.length-1);

        System.out.println("Array after merge sort:");
        for (int num : nums) { // Enhanced for-loop
            System.out.println(num);
        }

        sc.close();
    }

    public static void mergeSort(int nums[],int low,int high) {
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;


        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        conquer(nums, low, mid, high);
    }

    public static void conquer(int nums[],int low,int mid,int high){

        int res[]=new int[high-low+1];
        int k=0;
        int index1=low;
        int index2=mid+1;

        while(index1<=mid && index2<=high){
            if(nums[index1]<nums[index2]){
                res[k++]=nums[index1++];
            }else{
                res[k++]=nums[index2++];
            }
        }
        while(index1<=mid){
            res[k++]=nums[index1++];
        }
        while(index2<=high){
            res[k++]=nums[index2++];
        }

        for(int i=0,j=low;i<k;i++,j++){
            nums[j]=res[i];
        }
    }




}
