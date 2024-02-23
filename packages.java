// A conveyor belt has packages that must be shipped from one port to another within days days.

// The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

// Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.


//Solution

class Solution {
    public int daysreq(int[] arr,int capacity){
        int n=arr.length;
        int currentLoad=0;
        int days=1;
         for(int i=0;i<n;i++){
           
            if (currentLoad + arr[i] > capacity) {
                days++;
                currentLoad = arr[i]; // Start a new day with the current weight
            }

            else{
                currentLoad+=currentLoad+arr[i];
            }
        }
        return days;
    }


    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int n=weights.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,weights[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+weights[i];
        }
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int ndays=daysreq(weights,mid);
            if(ndays<=days){
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