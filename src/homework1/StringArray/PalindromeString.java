package homework1.StringArray;

public class PalindromeString {

    public void isAPalindrome(String inputString){

        boolean result = areEqual(inputString,0,inputString.length()-1);

        if (!result)
            System.out.println(inputString + " is Not a palindrome");
        else
            System.out.println(inputString + " is a Palindrome");

    }


    private boolean areEqual(String inputString,int start,int end){
        if (end <= start)
            return true;
        if(inputString.charAt(start) == inputString.charAt(end))
            return true && areEqual(inputString,start + 1,end - 1);
        else
            return false;
    }


}
