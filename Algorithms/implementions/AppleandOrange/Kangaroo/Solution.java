public class Solution {

    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int x1=s.nextInt();
            int v1=s.nextInt();
            int x2=s.nextInt();
            int v2=s.nextInt();
          betweenTwoSets(x1,v1,x2,v2);
           
            
    } 
    public static void betweenTwoSets(int x1,int v1,int x2,int v2) {
        String z1="YES";
        String z2="NO";
        int count=0;
        long temp1=0;
        long temp2=0;
        for(int i=0;i<=10000;i++) {
            temp1=temp1+v1;
            temp2=temp2+v2;
            long t=temp1+x1;
            long t1=temp2+x2;
            if(t == t1) {
                count++;
            }
            
        }
        if(count>=1) {
            System.out.println(z1);
        }
        else {
            System.out.println(z2);
        }
            
        
        }
 }