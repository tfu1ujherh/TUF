public class sortarrayzeros {
    public static void main(String[] args) {
        int nums[]={0, 2, 1, 2, 0, 1,2,0,1,2,0};

        int result[]=sort(nums);

        System.out.println("Sorted Array:");
        for(int i=0;i<nums.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int [] sort(int nums[]){

        int zeros=0;
        int ones=0;
        int twos=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }
            if(nums[i]==1){
                ones++;
            }
            if(nums[i]==2){
                twos++;
            }
        }
        int temp[]=new int[nums.length];
        int k=0;

        for(int i=0;i<zeros;i++){
            temp[k++]=0;
        }
        for(int i=0;i<ones;i++){
            temp[k++]=1;
        }
        for(int i=0;i<twos;i++){
            temp[k++]=2;
        }

        return  temp;
    }

}
