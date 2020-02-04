package com.java.logical;

public class ReturnIndexOfArray {

	public static void main(String[] args) {
		int[] nums= {2, 7, 11, 15};
		int target=17;
		int[] result=twoSum(nums,target);
		for (int i : result) {
			System.out.print(i+" ");
		}

	}

	private static int[] twoSum(int[] nums, int target) {
		int[] result=new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					for(int k=0;k<result.length-1;k++) {
						result[k]=i;
						result[k+1]=j;
					}
					}
				//break;
				}
			}
		return result;
	}

}
