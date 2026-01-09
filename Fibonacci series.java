import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n>=1 && n<=20 && m>=1 && m<=20){
            int[] fib=new int[21];
            fib[1]=0;
            fib[2]=1;
            for(int i=3;i<=20;i++){
                fib[i]=fib[i-1]+fib[i-2];
            }
            double sum=0;
            for(int i=n;i<=m;i++){
                sum+=fib[i];
            }
            System.out.println("The Sum of Fibonacci value is "+sum);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
