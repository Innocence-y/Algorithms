package datastructure.MyStack;

/**
 * 描述:测试
 *
 * @author 闫文强
 * @create 2018-04-01 20:44
 */
public class MyStackTest {
	public static void main(String[] args) {
		MyStack stack= new MyStack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek());
		while (!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		System.out.println(stack.isEmpty());
	}
}