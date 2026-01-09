import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ages = new int[n];
        for(int i=0;i<n;i++){
            ages[i]=sc.nextInt();
            if(n<0){
            System.out.println("Invalid Input");
                return;
            }
        }
        int Youngest=ages[0];
        int Oldest=ages[0];
        for(int i=1;i<n;i++){
            if(ages[i]<Youngest){
                Youngest=ages[i];
            }
            else if(ages[i]>Oldest){
                Oldest=ages[i];
            }
        }
        System.out.println("Youngest="+Youngest);
        System.out.println("Oldest="+Oldest);
            
    }
}
