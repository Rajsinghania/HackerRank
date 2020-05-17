import java.util.*;


public class Solution {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        //sort an array
        Arrays.sort(a);
        containers(a,n);
    }
        public static void containers(int a[],int n){
            int j=0;
            int totalContainer=0;
            while(j<n){
                int count=0;  
                int temp=a[j]+4;  //containers range
                for(int i=j;i<n;i++){  //traverse an array and find elements within range
                    if(a[i]<=temp){
                     count=1;
                    j++;
                    }
                }
            
                    if(count==1){
                     totalContainer++;
                   }
            }
             System.out.println(totalContainer);
        }
 }
