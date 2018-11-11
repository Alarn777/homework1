package homework1.StringArray;

/*

The class should include the following methods:
+ The method get(int) that returns the value in a specific place of the array.
+ The method set(double,int) that receives two arguments, the value and the desired index location, and place the value in the desired location.
+ The method getAverage() that returns the average of the numbers the array holds.
+ The method toString() that returns a textual representation of the object on which it was called.
 */


import java.util.Arrays;

public class MyArrayClass {
    private double arrayElement[];
    private int _size;
    public MyArrayClass(int size,double value) {
        this.arrayElement = new double[size];
        _size = size;
        for (int i = 0; i < this.arrayElement.length; i++)
        {
            this.arrayElement[i] = value;
        }

    }


    public MyArrayClass(double[] oldArray ) {
        this.arrayElement = new double[oldArray.length];
        _size = oldArray.length;
        for (int i = 0; i < oldArray.length; i++)
        {
            this.arrayElement[i] = oldArray[i];
        }

    }

    public MyArrayClass() {
        this.arrayElement = new double[0];
        _size = 0;
    }


    @Override
    public String toString() {
        StringBuffer temp = new StringBuffer();
        for (double tempValue: arrayElement) {
            temp.append(tempValue);
            temp.append(" ");

        }
        return temp.toString();
    }

    public double Average() {
        double avg = 0;
        for (double temp: arrayElement) {
            avg += temp;
        }
        return avg/arrayElement.length;

    }


}
