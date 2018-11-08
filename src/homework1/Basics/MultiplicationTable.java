package homework1.Basics;

public class MultiplicationTable {
    public void multTable(){
        for (int i = 1; i <= 9; i++){

            for (int j = 1; j <= 9; j++) {
                System.out.print( i * j + " " );
            }
            System.out.println(" ");
        }

    }
}
