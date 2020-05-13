import java.util.*;

public class Solution {

    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
       partition(a,0,a.length);
        
     }

    public static void partition(int a[],int start,int end) {
        int pivot=a[start];
        int low=start;
        int high=end-1;
        int temp = 0;
        while(low<high) {
            //we are searching here a[low] which is greater than pivot
            while(a[low]<=pivot)
             {
                low++;
        } 
            //we are searching here a[high] which is smaller than pivot
                while(a[high]>pivot) 
                {
                     high--;
                    }
                //we will swap both high and low element 
                if(low<high) {
                    temp=a[low];
                    a[low]=a[high];
                     a[high]=temp;
                }
            }
        //here we are swaping pivot with a[high] element
              int count=0;
               count=a[high];
              a[high]=a[start];
              a[start]=count;
              for(int i=0;i<a.length;i++) {
                  System.out.print(a[i]+" ");
              }
      }
 }


//if you want to learn algorithm of quicksort -partition (https://www.youtube.com/watch?v=7h1s2SojIRw)
