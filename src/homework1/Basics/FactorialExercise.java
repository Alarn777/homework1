package homework1.Basics;

public class FactorialExercise {
    public void factor()
    {
        long number, result;
        number = 6;
        result = factorial(number);
        System.out.println("The factorial of 6 is : " + result);
    }

    private static long factorial(long value)
    {
        long result = 1;
        while(value >=1 ) {
            result *= value;
            value--;
        }
        return result;
    }
}
