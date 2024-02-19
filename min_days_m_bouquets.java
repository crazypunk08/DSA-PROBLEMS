// You are given an integer array bloomDay, an integer m and an integer k.

// You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.

// The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.

// Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.


//optimal solution using binary search

class Solution {

    public static int possible(int[] flow,int day,int m,int k){
        int n=flow.length;
        int count =0;
        int bouqmde=0;
        for(int i=0;i<n;i++){
            if(flow[i]<=day){
                count++;
            }
            else{
                bouqmde+=(count/k);
                count=0;
            }
        }
         bouqmde+=(count/k);// saare flower khil gye
         if(bouqmde>=m){
             return 1;
         }
         else{
             return 2;
         }
         
    }

    public int minDays(int[] flow, int m, int k) {
        int n=flow.length;
        int ans=-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        long val=m*k;
        if(val>(long) n){
            return -1;
        }
        for(int i =0;i<n;i++){
            min=Math.min(min,flow[i]);
            max=Math.max(max,flow[i]);
        }

        int low=min;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int ref=possible(flow,mid,m,k);
            if(ref==1){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
      
    return ans;
    }
}


//results
// 92 / 92 test cases passed.
// Status: Accepted
// Runtime: 17 ms
// Memory Usage: 58.3 MB