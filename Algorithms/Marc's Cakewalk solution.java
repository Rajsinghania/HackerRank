import java.util.*;


public class Solution {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        //sort array
        Arrays.sort(a);
        miniMiles(a,n);
        }
        public static void miniMiles(int a[],int n){
            double j=0;
            double sum=0;
            //for minimum miles we can reverse sorted array
            for(int i=n-1;i>=0;i--){
              sum=sum+(a[i]*(Math.pow(2,j)));
              j++;
            }
            long c=(long) sum;
            System.out.println(c);
        }
}
