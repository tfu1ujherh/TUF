package BackTracking;
import java.util.*;

public class N_Queeens_II {
    public static void main(String[] args) {
        int n=4;
        
        Set<Integer>rows=new HashSet<>();
        Set<Integer>posDiagonal=new HashSet<>();
        Set<Integer>negDiagonal=new HashSet<>();
        int result=solve(n, 0, rows, posDiagonal, negDiagonal);

        System.out.println("No of solutions:"+result);

    }

    public static int solve(int n,int col,Set<Integer>rows,Set<Integer>posDiagonal,Set<Integer>negDiagonal){

        if(col==n){
            return 1;
        }
        int count=0;

        for(int row=0;row<n;row++){
            if(rows.contains(row)||posDiagonal.contains(row+col)||negDiagonal.contains(row-col)){
                continue;
            }

            rows.add(row);
            posDiagonal.add(row+col);
            negDiagonal.add(row-col);

            count=count+solve(n, col+1, rows, posDiagonal, negDiagonal);

            rows.remove(row);
            posDiagonal.remove(row+col);
            negDiagonal.remove(row-col);
        }

        return count;
    }
}
