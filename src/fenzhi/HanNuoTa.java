package fenzhi;

/**
 * 描述:汉诺塔分治法
 *
 * @author 闫文强
 * @create 2018-04-19 10:39
 */


public class HanNuoTa {
	/**
	 * 汉诺塔问题
	 * @param dish 盘子个数(也表示名称)
	 * @param from 初始塔座
	 * @param temp 中介塔座
	 * @param to   目标塔座
	 */
	public static void move(int dish,String from,String temp,String to){
		if (dish==1){
			System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
		}else {
			/**
			 * from为初始塔座，to为目标塔座，temp为中介塔座
			 */
			move(dish-1,from,temp,to);
			System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
			move(dish-1,temp,from,to);
		}
	}

	public static void main(String[] args) {
		move(3,"A","B","C");
	}
}