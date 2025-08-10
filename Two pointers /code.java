class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0;
        int r = nums.length-1;
        while(l<=r){
            if(nums[l]==val){
                nums[l] = nums[r];
                r--;
            }
            else{
                l++;
            }
        }
        return l;
    }
    
}
//another method to remove element preserving the original order
/*int k=0;
for(int i=0;i<arr.length;i++){
  if(arr[i]!=value){
    arr[k]=arr[i];
    k++;
  }
}return k;*/
