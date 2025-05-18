class demo{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotate(arr,5);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void reverse(int arr[],int low,int high){
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
            
        }

    }
    public static void rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

    }
}