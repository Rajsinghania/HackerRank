/*
if sum of two numbers is divisible by K, then if one of them gives remainder i, other will give remainder (K – i).
it will possible only when both two number is not divisible by k. First we store frequencies of numbers giving 
specific remainder in a frequency array of size K. Then we loop for all remainders i and include max(f[i], f[K – i]). 

*/



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
        int k=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
            
        }
      System.out.println(subarray(a,n,k));
          
        }
    public static int subarray(int a[],int n,int k) {
     // Array for storing frequency of modulo
       int a2[]=new int[k];
       // Fill frequency array with values modulo K 
       for(int i=0;i<n;i++){
           a2[a[i]%k]++;
       }
       // if K is even, then update f[K/2]
       if (k % 2 == 0) 
            a2[k/2] = Math.min(a2[k/2], 1); 
       // those type of number which is remider is zero 
       //initialize with 1 if count is greater than zero
            int len=Math.min(a2[0],1);
        for(int i=1;i<=k/2;i++){
            len=len+Math.max(a2[i],a2[k-i]);
        }
        return len;
    }
        
}
