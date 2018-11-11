package homework1.StringArray;

public class RecursiveBinarySearch {

    public void findInt(int[] array, int find){
        if(!find(array,0,array.length-1,find))
            System.out.println(find + " was not found!");
        else
            System.out.println(find + " was found");
    }

    private boolean find(int[] array, int start, int end,int find){
        if (start >= end )
            return false;
        if(array[start] == find || array[end] == find)
            return true;
        else
        {
            int tempStart = start,tempEnd = end,middle = 0;
//            int temp = 0;
            middle = (end-start)/2;
            if(array[start+middle] == find)
                return true;
            if(find > array[start+middle])
                return find(array,start+middle,tempEnd,find);
            else
                return find(array,tempStart,start+middle,find);


        }



    }


}
