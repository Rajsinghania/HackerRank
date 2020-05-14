import java.util.*;

public class Solution {

    public static void main(String []args){
        Scanner s =new Scanner(System.in);
     LinkedList<Integer>list=new LinkedList<>();
        int x=s.nextInt();
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            list.addAll(Arrays.asList(a[i]));
        }if(list.contains(x)==false){
            System.out.println("No");
        }else{
            int t=list.indexOf(x);
            System.out.println(t);

        }
        
    }
}
