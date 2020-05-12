import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
           
        int temp=0;
        int j=0;  
        int temp1=0;
        for(int i=1;i<n;i++){
            temp=a[i];
            j=i-1;
           
        while(j>=0 && a[j]>temp){
            temp1=a[j+1];
            a[j+1]=a[j];
            a[j]=temp1;
          
            j=j-1;
             }
        for(int k=0;k<n;k++) {
            System.out.print(a[k]+" ");
          }
        System.out.println();
        
            a[j+1]=temp;
        
        }
//        //here is final sorted array 
//        for(int i=0;i<a.length;i++){
//           System.out.print(a[i]+" ");
//       }
   }
}
