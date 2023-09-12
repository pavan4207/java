import java.io.*;
import java.util.*;
public class SumofNaturalnumbers{
    public static void main(String args[]){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n values :");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of first" +n+ "Natural numbers is:"+sum);
    }
}
