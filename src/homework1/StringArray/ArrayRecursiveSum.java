package homework1.StringArray;

public class ArrayRecursiveSum {


    public int recSumArr(int[] arr , int n){
        if (n == 0)
            return 0;
        else
            return arr[n-1] + recSumArr(arr,n-1);
    }
}
