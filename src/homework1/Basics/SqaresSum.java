package homework1.Basics;

public class SqaresSum {

    public int SumFunc(int n){
        int sum = 0;
        if (n == 1)
            return 1;
        else {
            return  n * n  + SumFunc(n-1);
        }
    }



}




