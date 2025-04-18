package Dp.Dp_on_Grids;

public class Ninjas_training {
    public static void main(String[] args) {
        int n=3;
        int points[][]={{1,2,5},{3,1,1},{3,3,3}};

        System.out.println(solve(n, points));
    }

    public static int solve(int n,int points[][]){

        int prev0=points[0][0];
        int prev1=points[0][1];
        int prev2=points[0][2];

        for(int day=1;day<n;day++){
            int curr0=Math.max(prev1,prev2)+points[day][0];
            int curr1=Math.max(prev0,prev2)+points[day][1];
            int curr2=Math.max(prev0,prev1)+points[day][2];

            prev0=curr0;
            prev1=curr1;
            prev2=curr2;
        }

        return  Math.max(prev0,Math.max(prev1,prev2));
    }
}
