import java.io.*;
import java.util.*;
class ReverseAlphabetical
{

    String reverse(String str)
    {
        String rStr = new StringBuffer(str).reverse().toString();
        return rStr;
    }

    String alphaOrder(String str)
    {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String aString = new String(charArray);
        return aString ;
    }
    public static void main(String[] args) throws IOException
    {
        System.out.print("Enter the String : ");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        System.out.println("String before reverse : " + inputString);
        ReverseAlphabetical obj = new ReverseAlphabetical();
        String reverseString = obj.reverse(inputString);
        String alphaString = obj.alphaOrder(inputString);
        System.out.println("String after reverse : " + reverseString);
        System.out.println("String in alphabetical order : " + alphaString);
    }
}
