package quicksort;

/**
 * 描述:快速排序
 *
 * @author 闫文强
 * @create 2018-04-02 22:36
 */
public class QuickSort {
	//数组array中下标为i和j位置的元素进行交换
	private static void swap(int[] array ,int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}



}