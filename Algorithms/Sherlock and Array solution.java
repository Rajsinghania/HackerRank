import java.util.*;

public class Solution {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++){
                a[j]=s.nextInt();
                
                
            }
            sharlockArray(a,n);
        }
    }
    public static void sharlockArray(int a[],int n){           
    int temp=0;
    int arraysum=0;    //intialize sum of whole array
    int leftsum=0;    //intialize leftsum
    //sum off whole array
    for(int i=0;i<n;i++){
            arraysum=a[i]+arraysum;
    }
    for(int i=0;i<n;i++){ 
   
   //sum is now right sum for index i 
   arraysum=arraysum-a[i];
            if(leftsum==arraysum){
               temp=1;
            }
            leftsum=leftsum+a[i];

            }
            if(temp==1){
                System.out.println("YES");

            }else{
                System.out.println("NO");
            }

    }

}
