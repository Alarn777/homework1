package homework1.StringArray;
import java.util.*;

public class SimpleSorting {
    private static int MAX = 999999;
    public void sort() {
        Vector<Integer> vectInt = new Vector<>();

        int vec[] = {1, 2, 3, 65, 23, 78, 5, 2, 1, 234, 23, 21, 2, 23, 323, 1111, 21};
        System.out.println("Unsorted array:");
        for (int aVec1 : vec) {
            System.out.print(aVec1 + " ");
        }
        System.out.println();
        int temp = MAX;
        for (int valBig: vec) {
            int deleteIndex = -1;
            for (int i = 0; i < vec.length;i++) {
                if (vec[i] <= temp) {
                    temp = vec[i];
                    deleteIndex = i;
                }
            }
            vec[deleteIndex] = MAX;
            vectInt.add(temp);
            temp = MAX;

            }
        for (int i = 0;i < vec.length;i++){
            vec[i] = vectInt.elementAt(i);
        }


        System.out.println("Sorted array:");
        for (int aVec : vec) {
            System.out.print(aVec + " ");
        }
        System.out.println();
    }

    }
