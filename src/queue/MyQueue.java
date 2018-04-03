package queue;

/**
 * 描述:队列的实现
 *
 * @author 闫文强
 * @create 2018-04-02 22:55
 */
public class MyQueue {
	public Object[] queArray;
	//队列总大小
	private int maxSize;
	//前端
	private int front;
	//后端
	private int rear;
	//队列中元素的实际数目
	private int nItems;

	public MyQueue(int s){
		maxSize = s;//最大容量
		queArray = new Object[maxSize];//创建数组
		front = 0; // 头
		rear = -1; // 尾
		nItems = 0; // 数量
	}



	//队列中新增数据
	public void insert(int value){
		if ((isFull())){
			System.out.println("队列已满");
		}else if (rear == maxSize - 1){
			//如果队列尾部指向顶了，那么循环回来，执行队列的第一个元素
			rear = -1;
		}else {
			//队尾指针加一，然后在队尾指针插入新的数据
			queArray[++rear] = value;
			nItems++;
		}
	}

	//查看队列的头数据
	public Object peekFront(){
		return queArray[front];
	}

	//移除数据
	public  Object remove(){
		Object removeValue = null;
		if (!isEmpty()){
			removeValue = queArray[front];
			queArray[front] = null;
			front++;
			if (front == maxSize){
				front = 0;
			}
			nItems--;
		}
		return removeValue;
	}

	//判断队列是否满了
	public boolean isFull(){
		return (nItems == maxSize);
	}

	//判断队列是否为空
	public  boolean isEmpty(){
		return (maxSize == 0);
	}

	//返回队列的大小
	public int getSize(){
		return nItems;
	}
}