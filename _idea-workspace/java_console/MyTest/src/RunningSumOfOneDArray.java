/*
                                           1480. Running Sum of 1d Array
                              https://leetcode.com/problems/running-sum-of-1d-array/
                                         Represented By Jia 06-17-2021

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

------------------------------------------------------------------------------------------------------------------------
The solution:
    (1) call the runningSum method and pass integer array from main method
    (2) details of runningSum method:
        * major for-loop to iterate through the input array
        * a sub-loop nested in the major for-loop to calculate the sum of array element (index from 0 to i)
        * to print the result, run another loop to iterate from the result array
*/
public class RunningSumOfOneDArray {
    public static void main(String[] args) {
        runningSum(new int[]{1,2,3,4});
        runningSum(new int[]{1,1,1,1,1});
        runningSum(new int[]{3,1,2,10,1});
    }

    private static void runningSum(int[] ints) {
        int[] result = new int[ints.length];
        int sum =0;
        for(int i=0;i<ints.length;i++){
            sum = 0;
            for(int j=0;j<=i;j++){
                sum += ints[j];
            }
            result[i]=sum;
        }
        System.out.print("[");
        for(int i=0;i<result.length;i++){
            if(i < result.length-1){
            System.out.print(result[i] + ", ");}
            else{
                System.out.print(result[i]);
            }
        }
        System.out.println("]");
    }
}
