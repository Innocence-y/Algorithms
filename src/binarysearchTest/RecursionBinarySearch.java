package binarysearchTest;

/**
 * 描述:递归实现二分查找
 *
 * @author 闫文强
 * @create 2018-04-19 10:26
 */
public class RecursionBinarySearch {
	public static int search(int[] arr, int key,int low, int high) {
		int mid = (high - low) / 2 + low;
		if (key == arr[mid]) {
			return mid;
		}else if (low > high) {
			return -1;
		} else {
			if (key < arr[mid]) {
			return search(arr, key, low, arr[mid - 1]);
			}
		  	if (key > arr[mid]) {
			return search(arr, key, arr[mid + 1], high);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array={12,23,54,65,14,52};
		int key= 14;
		System.out.println(search(array,key,1,array.length-1));
	}
}