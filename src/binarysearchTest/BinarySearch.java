package binarysearchTest;

/**
 * 描述:不用递归的二分查找
 *
 * @author 闫文强
 * @create 2018-04-19 10:17
 */
public class BinarySearch {
	public static int findTwoPoint(int[] arr, int key){
		int start= 0;
		int last = arr.length-1;
		while (start< last){
			int mid = (last-start)/2+start;
			if(key == arr[mid]){
				return mid;
			}else if (key > arr[mid]){
				start = mid+1;
			}else if (key < arr[mid]){
				last = mid -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 7, 9};
		System.out.println(findTwoPoint(arr, 5));
	}
}