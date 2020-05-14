import java.util.*;


public class Solution {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
        Arrays.sort(a);
        middleElement(a, n);
    }
    public static void middleElement(int a[],int n){
        int x=(0+n)/2;
        System.out.println(a[x]);

    } 
   
}
