import java.io.*;
import java.util.*;
class loop
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        int sum=0;
        int i=1;
        int a=sc.nextInt();
        for(i=0;i<=a;i++)
        {
            sum=sum+i;
        }
        
        System.out.println(sum);
        
    }
}
