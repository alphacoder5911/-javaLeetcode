class Solution {

    public int searchInsert(int[] nums, int target) {
    
    int counter=0;
    
    for(int i=0;i<nums.length;i++){
    
    if(nums[i]==target){
    
    return i;
    
    }
    
    else if(target>nums[i]){
    
    counter++;
    
    }else{
    
    return counter;
    
    }
    
    }
    
    return counter;
    
    }
    
    }


    // Binary search approach
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
    
            while (low <= high) {
                int mid = low + (high - low) / 2; // Prevent potential overflow
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return low; // 'low' will be the correct insertion index
        }
    }