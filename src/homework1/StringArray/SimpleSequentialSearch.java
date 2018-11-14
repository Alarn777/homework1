package homework1.StringArray;

public class SimpleSequentialSearch {
    static int TOTAL = 100;
    static int[] numbers = new int[TOTAL];

    public static void initiate()
    {
        for(int index=0; index<TOTAL; index++)
        {
            double number = Math.random();
            number *= 1000;
            int value = (int)number;
            numbers[index]=value;
        }
    }

    public static int search(int key)
    {
        for(int index=0; index<TOTAL; index++)
        {
            if(key==numbers[index])
            {
                return index;
            }
        }
        return -1;
    }

    public void find(String arr[])
    {
        initiate();
        int key = Integer.parseInt(arr[0]);
        System.out.println("key="+key);
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("numbers["+i+"]="+numbers[i]);
        }
        System.out.println();
        System.out.println("search(key)="+search(key));
    }



}
