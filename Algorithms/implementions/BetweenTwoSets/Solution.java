public class Solution {
  public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
           
            int n=s.nextInt();
            int m=s.nextInt();
            int a[]=new int[n];
            int b[]=new int[m];
            int result=b[0];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        for(int j=0;j<m;j++) {
            b[j]=s.nextInt();
            
        }
        int L = lcm(a);
        int G = gcd(b);
        int count = 0;
        for(int i = L, j =2; i<=G; i=L*j,j++){
            if(G%i==0){ count++;}
        }
        System.out.println(count);
      
         
            
    } 
     public static int gcd(int a, int b) {
         while(b>0) {
              int temp=b;
             b=a%b;
             a=temp;
         }
    return a;
     }
     public static int gcd(int b[]) {
       int result=b[0];
       for(int i=1;i<b.length;i++) {
           result=gcd(result,b[i]);
       }
    return result;
     }
     private static int lcm(int a, int b) {
            return a * (b / gcd(a, b));
        }
     public static int lcm(int a[]) {
         int result=a[0];
         for(int i=1;i<a.length;i++) {
             result=lcm(result,a[i]);
         }
        return result;
     }
    
}
