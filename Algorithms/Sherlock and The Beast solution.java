import java.util.*;

public class Solution {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            decentNumber(n);
        }
    }
    
    public static void decentNumber(int n){
        int fives=0;
        int threes=0;
        String str5="555";
        String str3="33333";
        
        while(n>0){
            if(n%3==0){ //if n divisible by 3
                while(n>0){
                  fives++;
                  n=n-3;  
                }
            }
            else if(n%5==0){ //if n is divisible by 5
                threes++;
                n=n-5;
            }
            else if(n%3 != 0 && n%5 != 0){ // if n is not divisible by both 3 and 5
                if(n>=3){
                     fives++;
                }
                     n=n-3;
                }
        }
        if(n<0){
            System.out.print("-1");
            
        }else{
        for(int i=0;i<fives;i++){
             System.out.print(str5);
        }
        for(int i=0;i<threes;i++){
            System.out.print(str3);
        }
        }
        System.out.println();
    }
}
