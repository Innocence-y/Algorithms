package tree;

/**
 * 描述:结点
 *
 * @author 闫文强
 * @create 2018-04-03 10:48
 */
public class Node {
	int data;
	Node leftChild;
	Node rightChild;
	boolean isDelete;

	public Node(int data){
		this.data = data;
	}

	public void display(){
		System.out.println(data);
	}
}