package homework1.StringArray;

public class SimpleNumbersLoop {

    public void printSimpleNumbers(){
        System.out.print("Primes between 100-199 are: ");
        for (int i = 100;i <= 199;i++){

            int divisors = 0;
            for (int j = 1; j <= i;j++) {
                if(divisors > 2)
                    break;
                if (i % j == 0)
                    divisors++;

            }
            if(divisors <= 2)
                System.out.print(i + " ");
            else
                divisors = 0;


        }
        System.out.println();


    }



}
