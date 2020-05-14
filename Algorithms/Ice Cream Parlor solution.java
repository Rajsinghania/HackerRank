import java.util.*;


public class Solution {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int m=s.nextInt();
            int n=s.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++){
                a[j]=s.nextInt();
            }
            pairs(a,n,m);
        }
    }
    public static void pairs(int a[],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==m){
                    System.out.println((i+1)+" "+(j+1));
                }
            }
        }
    }

    
}
