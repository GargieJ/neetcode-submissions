class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        return binSearch(nums,left,right,target);
       
    }

public int binSearch(int[] nums, int left, int right, int target){
            if (left>right){return -1; }
            int mid = left+(right-left)/2;
            if (nums[mid]==target){ return mid; }
           else if (nums[mid]<target) {
            return binSearch(nums,mid+1,right,target);
        }
        else {
            return binSearch(nums,left,mid-1,target);
        }
        
}
       }
