package InsertSort;

/**
 * 描述:直接插入排序
 *
 * @author 闫文强
 * @create 2018-04-01 20:26
 */
public class InsertSort {
	public static int[] sort(int[] array){
		int j;
		//从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
		for (int i = 0; i <array.length ; i++) {
			int temp= array[i];//记录要插入的数据
			j = i;
			while (j >0 && temp < array[j -1]){//从已经排序的序列最右边的开始比较，找到比其小的数
				array[j] = array[j-1];//向后挪动
				j--;
			}
			array[j] = temp;
		}
		return array;
	}

	//遍历显示数组
	public static void display(int[] array){
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		int[] array = {4,2,8,9,5,7,6,1,3};
		//未排序数组顺序为
		System.out.println("未排序数组顺序为：");
		display(array);
		System.out.println("-----------------------");
		array = sort(array);
		System.out.println("-----------------------");
		System.out.println("经过插入排序后的数组顺序为：");
		display(array);
	}

	/**
	 * 上面讲的三种排序，冒泡、选择、插入用大 O 表示法都需要 O(N2) 时间级别。一般不会选择冒泡排序，
	 * 虽然冒泡排序书写是最简单的，但是平均性能是没有选择排序和插入排序好的。
	 选择排序把交换次数降低到最低，但是比较次数还是挺大的。当数据量小，
	 并且交换数据相对于比较数据更加耗时的情况下，可以应用选择排序。
	 在大多数情况下，假设数据量比较小或基本有序时，插入排序是三种算法中最好的选择。
	 后面我们会讲解高级排序，大O表示法的时间级别将比O(N2)小。
	 */

}