class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;      // pointer for nums1's actual elements
        int j = n - 1;      // pointer for nums2
        int x = m + n - 1;  // pointer for write position 

        while(j >= 0){ // first process all the elements of 2nd array
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[x] = nums1[i]; 
                i--;                   
            }
            else{
                nums1[x] = nums2[j];
                j--;
            }
            x--;
        }
    }
}