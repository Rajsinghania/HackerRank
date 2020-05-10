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
        //here we have to check from rightmost cell
        for(int i=n-1;i>=0;i--){
            temp=a[i];
            j=i;
        while(j>0 && a[j-1]>temp){
            a[j]=a[j-1];
       //here we can print the campairing array
        for(int k=0;k<n;k++) {
            System.out.print(a[k]+" ");
          }
            System.out.println();
                j=j-1;
             }
            a[j]=temp;
        }
        //here is final sorted array 
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
   }
	        
}
