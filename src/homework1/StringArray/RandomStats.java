package homework1.StringArray;

public class RandomStats {

        public void test(){
        int INTERVALS = 10;
        int TOTAL = 80000;
        int[] stats = new int[TOTAL];
        for(int index=0; index< TOTAL; index++)
        {
            double number = Math.random();
            number *= 100;
            int value = (int)number;   // 0 <= value <= 99
            stats[value]++;
        }
        for(int index=0; index<INTERVALS; index++)
        {

        }
    }

}
