package mergesort;

/**
 * 描述:归并排序的非递归实现
 *
 * @author 闫文强
 * @create 2018-04-03 11:21
 */
public class MergeSort2 {
	/**
	 * 传入两个有序数组a和b，返回一个排好序的合并数组
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[] sort(int[] a,int[] b){
		int[] c = new int[a.length+b.length];
		int aNum = 0,bNum = 0,cNum=0;
		while(aNum<a.length && bNum < b.length){
			if(a[aNum] >= b[bNum]){//比较a数组和b数组的元素，谁更小将谁赋值到c数组
				c[cNum++] = b[bNum++];
			}else{
				c[cNum++] = a[aNum++];
			}
		}
		//如果a数组全部赋值到c数组了，但是b数组还有元素，则将b数组剩余元素按顺序全部复制到c数组
		while(aNum == a.length && bNum < b.length){
			c[cNum++] = b[bNum++];
		}
		//如果b数组全部赋值到c数组了，但是a数组还有元素，则将a数组剩余元素按顺序全部复制到c数组
		while(bNum == b.length && aNum < a.length){
			c[cNum++] = a[aNum++];
		}
		return c;
	}
}