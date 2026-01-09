import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>10){
            while(a>=100){
            a=a/10;
        }
        int c=a/10;
        int b=a%10;
        int swap=(b*10)+c;
        System.out.print(swap);
        }else{
            System.out.println("STDOUT");
        }

        
    }
}
