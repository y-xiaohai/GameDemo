package Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
/**
 * 功能：生成54张牌并 洗牌和发牌 
 * @author Administrator
 *
 */
public class DouDiZhu {

	public static void main(String[] args){
		/*
		 * 1  组装54张扑克牌
		 */
		//1.1创建map集合存储
		HashMap<Integer,String> pokerMap = new HashMap<Integer,String>();
		//1.2创建花色集合和数字集合
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> numbers = new ArrayList<String>();
		// 1.3 存储 花色 与数字
		Collections.addAll(colors, "♦", "♣", "♥", "♠");//相当于以下代码
//		colors.add("♦");
//		colors.add("♣");
//		colors.add("♥");
//		colors.add("♠");
		Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4","3");
		//设置存储编号变量
		Integer count = 1;
		pokerMap.put(count++, "大王");
		pokerMap.put(count++, "小王");
		//1.4创建牌型存储到集合中
		for(String number : numbers){
			for(String color : colors){
				String card = color + number;
				pokerMap.put(count++, card);
			}
		}
		System.out.println("生成的扑克牌：" + pokerMap);
		
		/*
		* 2   将54张牌顺序打乱
		*/
		// 取出编号 集合
		Set<Integer> numberSet = pokerMap.keySet();
		// 因为要将编号打乱顺序 所以 应该先进行转换到 list集合中
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.addAll(numberSet);
		
		//打乱顺序
		Collections.shuffle(numberList);
		
		System.out.println(numberList);
		
		// 3 完成三个玩家交替摸牌，每人17张牌，最后三张留作底牌
		// 3.1 发牌的编号
		// 创建三个玩家编号集合 和一个 底牌编号集合
		ArrayList<Integer> noP1 = new ArrayList<Integer>();
		ArrayList<Integer> noP2 = new ArrayList<Integer>();
		ArrayList<Integer> noP3 = new ArrayList<Integer>();
		ArrayList<Integer> dipaiNo = new ArrayList<Integer>();
		
		// 3.2发牌的编号
		for (int i = 0; i < numberList.size(); i++) {
			// 获取该编号
			Integer no = numberList.get(i);
			// 发牌
			// 留出底牌
			if (i >= 51) {
				dipaiNo.add(no);
			} else {
				if (i % 3 == 0) {
					noP1.add(no);
				} else if (i % 3 == 1) {
					noP2.add(no);
				} else {
					noP3.add(no);
				}
			}
		}
		System.out.println(noP1);
		System.out.println(noP2);
		System.out.println(noP3);
		System.out.println(dipaiNo);
		System.out.println("---------------------------");
		
		//  ♥3在谁手上底牌就给谁
//		if(noP1.contains(53)){
//			noP1.addAll(dipaiNo);
//		} else if(noP2.contains(53)){
//			noP2.addAll(dipaiNo);
//		} else if(noP3.contains(53)){
//			noP3.addAll(dipaiNo);
//		}
//		System.out.println(noP1);
//		System.out.println(noP2);
//		System.out.println(noP3);
//		System.out.println(dipaiNo);
		
		// 4 查看三人各自手中的牌（按照牌的大小排序）、底牌
		// 4.1 对手中编号进行排序
		Collections.sort(noP1);
		Collections.sort(noP2);
		Collections.sort(noP3);
		Collections.sort(dipaiNo);
		
		// 4.2 进行牌面的转换
		// 创建三个玩家牌面集合 以及底牌牌面集合
		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		ArrayList<String> player3 = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();
		
		// 4.3转换
		for (Integer i : noP1) {
			// 4.4 根据编号找到 牌面 pokerMap
			String card = pokerMap.get(i);
			// 添加到对应的 牌面集合中
			player1.add(card);
		}
		for (Integer i : noP2) {
			String card = pokerMap.get(i);
			player2.add(card);
		}
		for (Integer i : noP3) {
			String card = pokerMap.get(i);
			player3.add(card);
		}
		for (Integer i : dipaiNo) {
			String card = pokerMap.get(i);
			dipai.add(card);
		}
		//4.5 查看
		System.out.println("玩家1的牌："+player1);
		System.out.println("玩家2的牌："+player2);
		System.out.println("玩家3的牌："+player3);
		System.out.println("底牌："+dipai);
		
	}

}
