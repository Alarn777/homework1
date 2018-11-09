package homework1;
import homework1.Basics.*;
public class Main {

    public static void main(String[] args) {
        SimpleComputationRun();
        InnerLoopsDrawingShapesRun();
        MultiplicationTable();
        FactorialExerciseRun();
        SqaresSumRun(3);         //change the input to check different solutions
        RecursivePowerRun(2,3);
        NumsForLoopRun();
        FibonacciExerciseRun();
    }

    private static void FibonacciExerciseRun() {
        FibonacciExercise temp = new FibonacciExercise();
        temp.Fibonacci();
        System.out.println();
    }

    private static void NumsForLoopRun() {
        NumsForLoop temp = new NumsForLoop();
        temp.printNums();
        System.out.println();
    }

    private static void RecursivePowerRun(int x,int y) {
        RecursivePower temp = new RecursivePower();
        System.out.println("Input is: "+ x + "*" + y);
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
