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
        countingSort(a);
    }
    public static void countingSort(int a[]) {
        
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
     
        }
       
    }
}
