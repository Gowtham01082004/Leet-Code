class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public void mergesort(int [] arr,int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge(arr,start,mid,end);

        }
    }
    public void merge(int [] arr,int start,int mid,int end){
        int n1=mid -start+1;
        int n2=end-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[start+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+i+1];
        }
        int i=0;
        int j=0;
        int k=start;
        while(i<n1&&j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;

            }
            k++;

        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
         while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
}