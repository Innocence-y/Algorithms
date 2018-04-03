package tree;

/**
 * 描述:树
 *
 * @author 闫文强
 * @create 2018-04-03 10:50
 */
public interface Tree {
	//查找节点
	public Node find(int key);
	//插入新节点
	public boolean insert(int data);
	//中序遍历
	public void infixOrder(Node current);
	//前序遍历
	public void preOrder(Node current);
	//后序遍历
	public void postOrder(Node current);
	//查找最大值
	public Node findMax();
	//查找最小值
	public Node findMin();
	//删除节点
	public boolean delete(int key);
}