import java.io.*; 
import java.util.*;

public class Solution {

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner scn= new Scanner(System.in);
    int n = scn.nextInt();
    int[] numArray = new int[n];
    int i =0;
    while(scn.hasNextInt()){
        numArray[i++] = scn.nextInt();
    }

   int count =0;
   for(int k =0; k <n; k++){
       int sum = 0;
       for (int j =k ; j < n; j++) {
           sum = sum + numArray[j];
            if(sum < 0 ){
            count++;
           } 
       }
   }

   System.out.println(count);  
} 
}