import java.io.*;
import java.util.*;

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
            a[j+1]=a[j];
              j=j-1;
             }
          a[j+1]=temp;
         }
       //here is final sorted array 
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
   }
            
}
