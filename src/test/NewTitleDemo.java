package test;

import java.util.ArrayList;
import java.util.Iterator;

import entity.NewTitle;

public class NewTitleDemo {

	public static void main(String[] args) {
		// 创建实例对象
		NewTitle java = new NewTitle(1, "JAVA", "A");
		//NewTitle java1 = new NewTitle(1, "JAVA", "A");
		NewTitle android = new NewTitle(2, "Android", "B");
		// 创建一个ArrayList
		ArrayList newsTitleList = new ArrayList();//可以容纳任何对象
		
		// 添加元素
		newsTitleList.add(java);
		newsTitleList.add(android);
		
		//查看有效元素个数
		System.out.println(newsTitleList.size());
		
		//直接打印对象，会打印容器中容纳每个对象的toString
		System.out.println(newsTitleList);
		
		//获取某个元素，根据数据下标获取
		NewTitle newTitle = (NewTitle)newsTitleList.get(0);
		System.out.println(newTitle);
		
		/*
		 * NewTitle newTitle = (NewTitle)newsTitleList.get(4);
		 * 抛出异常  数组下标越界
		 */
		//add方法的重载，按数组下标添加。数组必须是连续的。。不能越界。
		/*newsTitleList。add(1,java);//list中是可以添加重复元素的
		 * System.out.println(newTitle);
		 *///数组可以重复的放入   相当于插入数据
		
		
		
		//遍历
		for (int i = 0; i < newsTitleList.size(); i++) {
			NewTitle title = (NewTitle) newsTitleList.get(i);
			System.out.println(i + 1 + ":" + title.getTitleName());
		}

		
		/* 通过迭代器遍历
		 * 如果有一个聚集，就应该提供访问聚集中某个元素和遍历元素的方式
		 * 并且不暴露集合的实现
		 * 
		 * 迭代器设计模式
		 * ArrayList已经提供了迭代器
		 * java.util.Iterator
		 */
		Iterator itor = newsTitleList.iterator();
		while(itor.hasNext()) {
			NewTitle demo = (NewTitle)itor.next();
			System.out.println(demo);
		}
		
		//foreach遍历
		for(Object obj : newsTitleList) {
			NewTitle demo2 = (NewTitle)obj;
			System.out.println(demo2);
		}
		
		//判断某个元素是否包含在集合中
		System.out.println(newsTitleList.contains(java));//--TRUE
		//System.out.println(newsTitleList.contains(java1));//--FALSE  在对象创建时两个 实际应用中是同一个  和实际应用有出入  
		//System.out.println(java.equals(java1));--FALSE
		/*
		 * list中contains方法的实现是拿传入的实际参数和集合中的元素进行equals()进行比较判断是否包含
		 * equals()方法是Object类中比较的两个对象的地址，而在实际应用中我们一般认为equals只要返回true
		 * 就是两个相同的对象 所以根据实际情况重写equals()方法
		 */
	}

}
