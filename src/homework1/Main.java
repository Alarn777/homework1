package homework1;
import homework1.Basics.*;
public class Main {

    public static void main(String[] args) {
        SimpleComputationRun();
        InnerLoopsDrawingShapesRun();
        MultiplicationTable();
        FactorialExerciseRun();

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
