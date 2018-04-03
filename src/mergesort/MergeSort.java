package mergesort;

import java.util.Arrays;

/**
 * 描述:归并排序
 *
 * @author 闫文强
 * @create 2018-04-02 22:28
 */


/**
 * 归并排序的递归算法
 */
public class MergeSort {
	public static int[] mergeSort(int[] c, int start, int last){
		if (last > start){
			int mid = start + (last - start)/2;
			mergeSort(c, start,mid);
			mergeSort(c,mid+1,last);
			merge(c,start,mid,last);
		}
		return c;
	}


	public static void merge(int[] c, int start, int mid, int last){
		int[] temp = new int[last-start+1];//定义临时数组
		int i = start;//定义左边数组的下标
		int j = mid + 1;//定义右边数组的下标
		int k = 0;
		while (i <= mid && j <=last){
			if (c[i] < c[j]){
				temp[k++] = c[i++];
			}else {
				temp[k++] = c[j++];
			}
		}
		//把左边剩余数组元素移入新数组中
		while (i<=mid){
			temp[k++] = c[i++];
		}

		//把右边剩余数组元素移入到新数组中
		while(j <= last){
			temp[k++] = c[j++];
		}

		//把新数组中的数覆盖到c数组中
		for(int k2 = 0 ; k2 < temp.length ; k2++){
			c[k2+start] = temp[k2];
		}

	}

	public static void main(String[] args) {
		int[] c = {2,7,8,3,1,6,9,0,5,4};
		c = mergeSort(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
	}
}