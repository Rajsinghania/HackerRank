import java.util.*;

public class Solution {

    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        mindiff(a,n);
    }
    public static void mindiff(int a[],int n){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
        
           if(a[i]>=0 && a[i+1]>=0){
               int absdiff=Math.abs(a[i]-a[i+1]);
               min=Math.min(min,absdiff);
           }
           
            if(a[i]<0 && a[i+1]<0){
               int absdiff1=Math.abs(a[i]-a[i+1]);
               min=Math.min(min,absdiff1);
           }
        }
        
        System.out.println(min);
    }
}
