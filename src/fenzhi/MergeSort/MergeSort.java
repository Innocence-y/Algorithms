package fenzhi.MergeSort;

import java.util.Arrays;

/**
 * 描述:分治算法的非递归实现
 *
 * @author 闫文强
 * @create 2018-04-19 10:45
 */
public class MergeSort {
	public static int[] sort(int[] a, int[] b){
		int[] c = new int[a.length + b.length];
		int aNum = 0,bNum = 0,cNum=0;
		while (aNum < a.length&& bNum < b.length){
			if (aNum >= bNum){
				c[cNum++] = b[bNum++];
			}else {
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

	public static void main(String[] args) {
		int[] a = {4,6,8,2,3};
		int[] b = {23,56,74,21,94};
		int[] c = new int[a.length+b.length];
		c = sort(a,b);
		System.out.println(Arrays.toString(c));
	}
}