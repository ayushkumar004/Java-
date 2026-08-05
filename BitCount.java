//Given an array of positive integers arr and an integer target, count how many numbers in the array have exactly target set bits (1s) in their binary representation.
//Example:
//Input:
//arr = [3, 5, 7, 8, 10]
//target = 2
//Output:
//3

import java.util.*;
public class Main { static int countMatches(int[] arr,int target)
  { 
    int ans=0;
   for(int num:arr)
     { 
       if(Integer.bitCount(num)==target){ 
       ans++; 
       }
     } 
    return ans;
  } 
public static void main(String[] args) 
  { int[] arr={3,5,7,8,10};
   int target =2; 
   int answer=countMatches(arr,target); 
   System.out.println(answer);
  } 
}
