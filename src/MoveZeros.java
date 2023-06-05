/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
*/


import java.util.Arrays;

public class MoveZeros {
    public static void moveZerosToEnd(int[] nums){
        int left = 0;
        int right = 0;

        while(right < nums.length){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }
            right++;
        }

        while(left < nums.length){
            nums[left] = 0;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZerosToEnd(nums);
        System.out.println(Arrays.toString(nums));
    }
}
