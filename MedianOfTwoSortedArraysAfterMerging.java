public class MedianOfTwoSortedArraysAfterMerging {

    public static void main(String[] args){
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    double median =0;
	    int n = nums1.length; // length of first array
	    int m = nums2.length; // length of second array
	    
	    int[] nums = new int[n+m];
	    int i=0;
	    int j=0;
	    for(int z = 0; z<nums.length; z++) {
	    	if(i >= n) {
	    		nums[z] = nums2[j++];
	    		continue;
	    		
	    	}
	    	if(j >= m ) {
	    		nums[z] = nums1[i++];
	    		continue;
	    	}
	    	if(nums1[i] == nums2[j]) {
                nums[z++] = nums1[i++];
                nums[z] = nums2[j++];
                continue;
            }
	    	
	    	if(nums1[i] < nums2[j]) {
	    		nums[z] = nums1[i++];
	    		continue;
	    	}
	    	if(nums1[i] > nums2[j]) {
	    		nums[z] = nums2[j++];
	    		continue;
	    	}
	    	
	    }
	    int mid = 0;
	    if((m+n)%2 == 0) {
	    	mid = ((m+n)/2)-1;
	    	median = ( nums[mid] + nums[mid+1] ) / 2.0;
	    	
	    }else {
	    	mid = ((m+n)-1)/2;
	    	median = nums[mid];
	    }
	    
	    return median;  
	}	
	
	
}
