package Factorial;

/**
 * 描述:递归的算法实现
 *
 * @author 闫文强
 * @create 2018-04-19 10:00
 */
public class RecursionFactorial {
	public static int getFactorical(int n) {
		if (n >= 0) {
			if (n == 0) {
				System.out.println(n + "!=1");
				return 1;
			}else {
				System.out.println(n);
				int temp = n * getFactorical(n - 1);
				System.out.println(n+"!="+temp);
				return temp;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(getFactorical(5));
	}

}