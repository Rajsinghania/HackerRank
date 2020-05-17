import java.util.*;


public class Solution {

   
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int [] a = new int[1001];
        for (int i = 0; i < N; i++) {
            int x=s.nextInt();
                a[x]++; //counting the frequency of elements in A
        }
        int beautifulPairs = 0;
        for (int i = 0; i < N; i++) {
            int num = s.nextInt();
            if (a[num] > 0){ //checking occurence of number in seconde B
               a[num]--;
                beautifulPairs++; // counting pairs 
            }
        }
        
        
        /* Accounts for changing 1 element in B */
        if (beautifulPairs == N) {
            beautifulPairs--;
        } else {
            beautifulPairs++;
        }
        System.out.println(beautifulPairs);
    }
}
