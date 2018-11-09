package homework1.Basics;

public class RecursivePower {

    public int recPower(int x, int y){
        if (y == 1)
            return x;
        else
            return x * recPower(x,y-1);




    }

}
