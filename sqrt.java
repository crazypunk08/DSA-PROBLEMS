// Leetcode 69:

// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// Solution:

class Solution {
    public int mySqrt(int x) {
    long low=0;
     long high=x;
     int ans=0;
     while(low<=high){
         long mid=(low+high)/2;
         long val=mid*mid;
         if(val<=(long)x){
             ans=(int) mid;
             low=mid+1;
         }
         else{
             high=mid-1;
         }
         
     }
     return ans;
}
}

// Analytics:

// 1017 / 1017 test cases passed.
// Status: Accepted
// Runtime: 1 ms
// Memory Usage: 41.3 MB