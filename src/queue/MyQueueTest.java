package queue;

/**
 * 描述:测试
 *
 * @author 闫文强
 * @create 2018-04-03 10:11
 */
public class MyQueueTest {
	public static void main(String[] args) {
		MyQueue queue= new MyQueue(3);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);


		System.out.println(queue.peekFront());
		queue.remove();
		for (int i = 0; i <queue.queArray.length ; i++) {
			System.out.println(queue.queArray[i]);
		}
		System.out.println(queue.peekFront());

		queue.insert(4);//queArray数组数据为[4,2,3]
		queue.insert(6);
		for (int i = 0; i <queue.queArray.length ; i++) {
			System.out.println(queue.queArray[i]);
		}
		//System.out.println(queue.queArray);

	}

}