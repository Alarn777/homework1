package homework1.StringArray;

public class SimpleTextualSorting {


    public void func() {
        String vec[] = {"abc", "aab", "aaa", "zxc", "cxs", "qwe", "gfd", "hjk", "asd"};
        for (int index = 1; index < vec.length; index++) {
                String key = vec[index];
                int j = index-1;
                int aka =  key.hashCode();
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && vec[j].hashCode() > key.hashCode())
                {
                    vec[j+1] = vec[j];
                    j = j-1;
                }
                vec[j+1] = key;
            }



            for (int index = 0; index < vec.length; index++) {
            System.out.print(vec[index] + " -> ");
        }
    }
}