import java.util.*;

public class Solution {

   
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        countingSort(a,n);
    }
    public static void countingSort(int a[],int n) {
         //here we can take empty array 
        int k[]=new int[100];
        for(int i=0;i<n;i++) {
            //here we can count the frequency of digits.
            k[a[i]]++;
     
        }
        for(int i=0;i<100;i++) {
            System.out.print(k[i]+" ");
        }
    }
    
}
