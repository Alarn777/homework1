package homework1.Basics;

public class NumsForLoop {
    public void  printNums(){
        for (int i = 1;i <= 100;i++){
            if(i%2 == 0)
                System.out.println(i + " Divides by 2");
            if(i%3 == 0)
                System.out.println(i + " Divides by 3");
            if(i%4 == 0)
                System.out.println(i + " Divides by 4");
            if(i%5 == 0)
                System.out.println(i + " Divides by 5");
            }
    }

}
