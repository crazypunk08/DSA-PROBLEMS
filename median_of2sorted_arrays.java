// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

//Most direct and clean solution
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int n1=nums1.length;
        int n2=nums2.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                list1.add(nums1[i++]);
            }
            else{
                list1.add(nums2[j++]);
            }
        }
        while(i<n1){
            list1.add(nums1[i++]);
        }
         while(j<n2){
            list1.add(nums2[j++]);
        }

        int n=n1+n2;
        if(n%2==0){
            double med1=list1.get(n / 2);
            int med2=list1.get((n / 2) - 1);
             double median = (med1+med2) / 2;
        return median;
        }
        else{
             return (double) list1.get(n / 2);
        }
    }
}