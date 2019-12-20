import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
		int[] nums1 = {1, 3};
		int[] nums2 = {2};
		System.out.println(m.findMedianSortedArrays(nums1, nums2));
		int[] nums3 = {1, 2};
		int[] nums4 = {3, 4};
		System.out.println(m.findMedianSortedArrays(nums3, nums4));
	}
	
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
    	System.arraycopy(nums1, 0, arr, 0, nums1.length);
    	System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        
        Arrays.sort(arr);
        
        if (arr.length % 2 == 1) {
        	return (double) arr[arr.length / 2];
        } else {
        	return ((double) arr[arr.length / 2] + (double)arr[arr.length / 2 - 1]) / 2.0;
        }
    }

}
