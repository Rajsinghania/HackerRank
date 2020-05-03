public class Solution {
    public static void main(String[] args)  {
         Scanner s=new Scanner(System.in);
            int n=s.nextInt();
           int[] a=new int[n];
          for(int i=0;i<a.length;i++) {
              a[i]=s.nextInt();
          }
          sort(a);
    }
      public static void sort(int[] a) {
        int rem=0;
        int Round=0;
     for(int i=0;i<a.length;i++) {
            rem=a[i]%5;
            int x=(5-rem);
            if(x<3 && a[i]>=38) {
                System.out.println(a[i]+x);
            }
            if(x>=3 && a[i]>=38) {
                System.out.println(a[i]);
            }
            else if(a[i]<38) {
                System.out.println(a[i]);
            }
            
            }
     }   
        
}
