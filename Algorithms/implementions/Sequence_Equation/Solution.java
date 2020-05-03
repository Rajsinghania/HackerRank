/*we can use linkedlist. and we can find the 
 * index of each element.we hava given 1<=p(x)<=n
 * for each For each x  where1<=x<=n,
 *  
 */
import java.util.*;
public class Solution {
	public static void main(String []args){
        Scanner s=new Scanner(System.in);
        LinkedList<Integer>list=new LinkedList<>();
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=s.nextInt();
        	//here i am going to add all elements of array into list
        	list.addAll(Arrays.asList(a[i]));
        }
        for(int i=1;i<=n;i++) {
        	//we can find index of i
        	int x=list.indexOf(i);//p(x)
        	int value=list.indexOf(x+1);//p(p(y))=x 
        	System.out.println(value+1);
        }
        
       }
	}