package homework1;
import homework1.Basics.*;
import homework1.StringArray.*;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Basics
        SimpleComputationRun();
        InnerLoopsDrawingShapesRun();
        MultiplicationTable();
        FactorialExerciseRun();
        SqaresSumRun(3);         //change the input to check different solutions
        RecursivePowerRun(2,3);
        NumsForLoopRun();
        FibonacciExerciseRun();





        //Arrays and Strings
        int[] arr =  {2,4,12,56,62,75,81};
        ArrayRecursiveSumRun(arr,3);

        LovelyFlowersRun();
        MyArrayClassRun(4,3.1);


        PalindromeString("alla");
        RandomStatsRun();

        RecursiveBinarySearchRun(arr,75);
        RecursiveBinarySearchRun(arr,11);

        SimpleBinarySearchRun();

        SimpleNumbersLoopRun();

        SimpleSequentialSearchRun();

        SimpleSortingRun();

        SimpleStringBufferUsage temp = new SimpleStringBufferUsage();
        temp.bufferUsage();

    }

    private static void SimpleSortingRun() {
        SimpleSorting temp = new SimpleSorting();
        temp.sort();
        System.out.println();
    }

    private static void SimpleSequentialSearchRun() {
        SimpleSequentialSearch temp = new SimpleSequentialSearch();
        String[] arg;
        arg =  new String[1];
        arg[0] = "121";
        System.out.println("Looking for: " + arg[0]);
        System.out.println();
        temp.find(arg);
        System.out.println();
    }

    private static void SimpleNumbersLoopRun() {
        SimpleNumbersLoop temp = new SimpleNumbersLoop();
        temp.printSimpleNumbers();
    }

    private static void SimpleBinarySearchRun() {
        SimpleBinarySearch temp = new SimpleBinarySearch();
        temp.testAlg();
        System.out.println();
    }

    private static void RecursiveBinarySearchRun(int[] arr,int a) {
        RecursiveBinarySearch temp = new RecursiveBinarySearch();
        temp.findInt(arr,a);
        System.out.println();
    }

    private static void RandomStatsRun() {
        RandomStats temp = new RandomStats();
        temp.test();
        System.out.println();
    }

    private static void PalindromeString(String input) {
        PalindromeString temp = new PalindromeString();
        temp.isAPalindrome(input);
        System.out.println();
    }

    private static void MyArrayClassRun(int a, double b) {
        MyArrayClass temp = new MyArrayClass(a,b);
        System.out.println("Avg :" + temp.Average());
        System.out.println(temp);
        System.out.println();
    }

    private static void LovelyFlowersRun() {
        LovelyFlowers temp1 = new LovelyFlowers("Rose", Color.RED, true);
        LovelyFlowers temp2 = new LovelyFlowers("Azalea", Color.WHITE, false);
        LovelyFlowers temp3 = new LovelyFlowers("Orchid", Color.PINK, true);
        LovelyFlowers temp4 = new LovelyFlowers("Lilies", Color.YELLOW, true);
        LovelyFlowers[] tempArray = {temp1,temp2,temp3,temp4};

        for (LovelyFlowers temp : tempArray){
            System.out.println(temp);
        }
        System.out.println();
    }

    private static void ArrayRecursiveSumRun(int[] arr,int n) {
        ArrayRecursiveSum temp = new ArrayRecursiveSum();
        System.out.print("In Array you gave sum of first " + n + " numbers is: ");
        System.out.println(temp.recSumArr(arr,n));
        System.out.println();
    }

    private static void FibonacciExerciseRun() {
        FibonacciExercise temp = new FibonacciExercise();
        temp.Fibonacci();
        System.out.println();
        System.out.println();
    }

    private static void NumsForLoopRun() {
        NumsForLoop temp = new NumsForLoop();
        temp.printNums();
        System.out.println();
    }

    private static void RecursivePowerRun(int x,int y) {
        RecursivePower temp = new RecursivePower();
        System.out.println("Input is: "+ x + "^" + y);
        System.out.println("Output is: " + temp.recPower(x,y));
        System.out.println();
    }

    private static void SqaresSumRun(int n) {
        SqaresSum temp = new SqaresSum();
        System.out.println("Input is: 3");
        System.out.println("Output is: " + temp.SumFunc(n));
        System.out.println();
    }

    private static void FactorialExerciseRun() {
        FactorialExercise temp = new FactorialExercise();
        temp.factor();
        System.out.println();
    }

    private static void InnerLoopsDrawingShapesRun() {
        InnerLoopsDrawingShapes inn = new InnerLoopsDrawingShapes();
        inn.draw();
        System.out.println();
    }

    private static void SimpleComputationRun() {
        SimpleComp comp = new SimpleComp();
        comp.main(null);
        System.out.println();
    }

    private static void MultiplicationTable() {
        MultiplicationTable comp = new MultiplicationTable();
        comp.multTable();
        System.out.println();
    }


}
