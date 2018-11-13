package homework1.StringArray;

public class SimpleBinarySearch {
    static int vec[] = {2,5,22,23,24,25,43,54,65,77,83,91,102,120,
            125,154,156,184,190,200,355,3434,23423};

    public void testAlg()
    {
        System.out.print("The index of 102 is: ");
        System.out.println(search(vec,102));
    }

    private int search(int vec[],int number)
    {
        int low=0, high=vec.length-1;
        while(low<=high)
        {
            int index = (high+low)/2;
            if(vec[index] == number)
            {
                return index;
            }
            else
            {
                if(number > vec[index])
                {
                    low = index;
                }
                else
                {
                    high = index;
                }
            }
        }
        return -1;
    }


}
