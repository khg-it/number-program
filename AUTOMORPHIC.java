
import java.util.*;
public class AUTOMORPHIC{
    public static void main(String[]args)
    {
        int num=25;
        int square=num*num;
        System.out.println("square of the given number is: "+square);
        int r=num%10;
        int p=square%10;
        if(r==p)
        {
            System.out.println(num+"is an automorphic number");
        }
        else
        {
            System.out.println(num+"is not an automorphic number");
        }
    


    }
    
}
