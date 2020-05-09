import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
all we know in magic squre sum of row or column
and diagonal will be n*(n^2+1)/2
and we can write in simple way like
2 9 4
7 5 3
6 1 8
*/

public class Solution {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //here possible way to write of magic square  
        
        int[][][] possibleWay = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},

            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},

            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},

            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},

            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},

            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},

            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},

            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };

        int[][] S = new int[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
                S[i][j] = s.nextInt();
        }

        int minimumWay = Integer.MAX_VALUE;
        for (int way = 0; way < 8; way++) 
        {
            int temp = 0;
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++)
                    temp += Math.abs(S[i][j] - possibleWay[way][i][j]);
            }
            minimumWay = Math.min(minimumWay, temp);
        }
        System.out.println(minimumWay);
    }
}
