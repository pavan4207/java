import java.io.*;
import java.util.*;
public class FactorialDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer to find factorial less than 10:");
        int n = sc.nextInt();
        int fact=1;
        for(int i=n;i>=2;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of"+n+"is"+fact);
    }
}
