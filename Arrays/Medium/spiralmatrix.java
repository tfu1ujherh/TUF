import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
    
        List<Integer>result=spiralMatrix(nums);

        System.out.println("Spiral sequence:");
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+"  ");
        }
    
    }
    public static List<Integer> spiralMatrix(int nums[][]){

        List<Integer>result=new ArrayList<>();

        int n=nums.length;
        int m=nums[0].length;

        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(nums[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                result.add(nums[i][right]);
            }
            right--;

            if(top<=bottom){
            for(int i=right;i>=left;i--){
                result.add(nums[bottom][i]);
            }
            bottom--;
            }


            if(left<=right){

            for(int i=bottom;i>=top;i--){
                result.add(nums[i][left]);
            }
            left++;
        }
        }

        return result;
    }
}
