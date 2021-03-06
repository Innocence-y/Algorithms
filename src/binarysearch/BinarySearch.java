package binarysearch;

/**
 * 描述:二分查找的递归与非递归
 *
 * @author 闫文强
 * @create 2018-04-01 18:08
 */
public class BinarySearch {
	/**
	 * 二分查找递归实现
	 * @param arr 有序数组
	 * @param start  数组低地址下标
	 * @param end 数组高地址下标
	 * @param key 查找元素
	 * @return 查找元素不存在返回-1
	 */
	public static int binSearch(int arr[], int start, int end,int key){
		int mid=(end- start)/2 +start;
		if (arr[mid] == key){
			return mid;
		}if (start>=end){
			return -1;
		}else if (key > arr[mid]){
			return binSearch(arr,mid+1,end,key);
		}else if (key < arr[mid]){
			return binSearch(arr, start, mid-1, key);
		}
		return -1;
	}


	/**
	 * 二分查找普通实现
	 * @param arr 有序数组
	 * @param key 查找元素
	 * @return 不存在返回-1
	 */
	public static int binSearch(int arr[], int key){
		int mid;
		int start = 0;
		int end = arr.length-1;
		while (start <= end){
			mid = (end-start)/2+start;
			if (key <arr[mid]){
				end = mid-1;
			}else if (key >arr[mid]){
				start = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]={3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
		System.out.println(binSearch(arr,0,arr.length-1,101));
		System.out.println(binSearch(arr,81));
	}
}