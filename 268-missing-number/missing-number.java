class Solution {
    public int missingNumber(int[] nums) {


        int i=0;
		
		while(i<nums.length) {
			
			int correct=nums[i];
			
			if(correct<nums.length && nums[i]!=nums[correct]) {
				swap(nums,i,correct);
			}
			else {
                i++;
			}
		}

        return getNum(nums);
            


    
    }

    public static void swap(int[] nums, int index, int element) {
		int temp;
		temp=nums[element];
		nums[element]=element;
		nums[index]=temp;
		
		
	}

    public static int getNum(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }

        return arr.length;
    }
}