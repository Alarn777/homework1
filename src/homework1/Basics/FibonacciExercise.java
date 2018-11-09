package homework1.Basics;



public class FibonacciExercise {
    public void Fibonacci(){
        int userInt = 20;
        System.out.println("First " + userInt + " Fibonacci numbers are:");
        System.out.print("0 ");
        for (int n = 0,count = userInt,j = 1;count > 0;count--) {
            int temp = n;
            n = n +j;
            j = temp;
            System.out.print(n + " ");
        }
    }
}
