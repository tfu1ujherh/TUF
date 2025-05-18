package Easy;

import java.util.*;

public class union {
    public static void main(String[] args) {
        
        int arr1[]={1,2,3,4,5};
        int arr2[]={3,4,5,6,7};
        int result[]=Union(arr1, arr2);
        System.out.println("Union of array");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
    public  static int[] Union(int arr1[],int arr2[]){

        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }

        int result[]=new int[set.size()];
        int index=0;
        
        Iterator<Integer>iterator=set.iterator();

        while(iterator.hasNext()){
            result[index++]=iterator.next();

        }
        return result;
    }

}
