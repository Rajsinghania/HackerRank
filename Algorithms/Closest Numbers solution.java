import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        minPairs(a,n);
    }
    public static void minPairs(int array[],int n){
        int minAbs=Integer.MAX_VALUE;
    StringBuilder pairs = new StringBuilder("");
        for(int i = 0; i < n-1; i++)
        {
            int absDiff;
            
      if((array[i]<0 && array[i+1]<0)||(array[i]>0 && array[i+1]>0))//both numbers have matching signs
    absDiff = Math.abs(array[i] - array[i+1]); //Absolute difference
            else
                absDiff = Math.abs(array[i]) + Math.abs(array[i+1]); //Absolute difference
            
            if(absDiff < minAbs)//New minAbs
            {
                minAbs = absDiff;
                pairs = new StringBuilder("");//Empty pairs
                pairs.append(array[i]+ " " +array[i+1]+" ");//Add pair
            }
            else if(absDiff == minAbs)//Multiple minAbs
                pairs.append(array[i]+ " " +array[i+1]+" ");//Add pair
        }
        
        System.out.println(pairs);
    }

   
}
