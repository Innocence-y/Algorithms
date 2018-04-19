package Factorial;

/**
 * 描述:阶乘的一般实现
 *
 * @author 闫文强
 * @create 2018-04-19 9:52
 */

/**
 * 0！=1  1！=1
 * 负数没有阶乘,如果输入负数返回-1
 * @param n
 * @return
 */
public class Factorial {
	public static int getFactorialFor(int n){
		int temp = 1;
		if (n >=0){
			for (int i = 1; i <= n; i++) {
				temp = temp *i;
			}
			return temp;

		}else {
			return -1;
		}

	}

	public static void main(String[] args) {
		System.out.println(getFactorialFor(5));
	}
}