// A peak element is an element that is strictly greater than its neighbors.

// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }

        if(nums[n-1]>nums[n-2]){
            int num=n-1;
            return num;
        }

       int  low=1;
       int  high=n-2;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    }

//  Analytics
    
// 66 / 66 test cases passed.
// Status: Accepted
// Runtime: 0 ms
// Memory Usage: 42.7 MB