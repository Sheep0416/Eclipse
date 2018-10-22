/*
 * l6.(*)Craps賭博遊戲.
 *	由玩家(player)第一輪擲兩顆骰子,骰子和若為7或11,則玩家贏(win).
 *	若和為2,3,12,則莊家(house)贏.若和為4,5,6,8,9,10,則和視為玩家點數.
 *	接下來玩家必須繼續擲兩顆骰子,直到先前點數重新出現(即得點)為止.
 *	得點前,若玩家擲出7,即算輸局(lose).
 *	請寫一程式,連續模擬本遊戲輸贏10000次,並統計輸贏機率.
 *  (註:由電腦模擬過程可回答下列問題:
 *	一、有多少次是在第一次擲骰、第二次擲骰、…、第二十次擲骰、第二十次以上擲骰獲勝的？
 *	二、有多少次是在第一次擲骰、第二次擲骰、…、第二十次擲骰、第二十次以上擲骰輸給莊家的？
 *  三、玩CRAPS賭博遊戲獲勝的機率是多少？(註:craps號稱是最公平賭博之一,你覺得呢)
 *  四、平均每次輸贏需要擲骰幾次？
 *  五、每局中獲勝的機率是否隨著擲骰次數的增加而增加？
 *  六、模擬的次數多寡對於你上面幾個問題的答案是否有影響？其影響如何？
 *  以上問題六摘自http://www.ame.ntu.edu.tw/~ttlin/newpage54.htm)
 *  
 *  dice > win / lose
 *  dice > no result > dice loop > win / lose
 */
package arraypractice;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class ArrayCrapsL6 {
	
	private static Integer win = 0;
	private static Integer lose = 0;
	private static HashMap<Integer, Integer> hashWin;
	private static HashMap<Integer, Integer> hashLose;
	
	public static int dice() {
		Random random = new Random();
		int dice = random.nextInt(6) + 1;
		int dice2 = random.nextInt(6) + 1;
		return dice + dice2;
	}

	public static int[] game() {
		int dice = 0;
		int winner = 0;
		int score = dice();
		dice++;
		if(score == 7 || score == 11) {
			win++;
			winner = 1;
		} else if(score == 2 || score == 3 || score == 5) {
			lose++;
			winner = 0;
		} else {
			boolean game = true;
			int target = score;
			do {
				int a = dice();
				dice++;
				if(a == target) {
					win++;
					winner = 1;
					game = false;
				} else if(a == 7) {
					lose++;
					winner = 0;
					game = false;
				}
			}while(game);
		}
		int[] arr = new int[2];
		arr[0] = winner;
		arr[1] = dice;
		return arr;
	}
	// TODO
	public static void gameStart(int turn) {
		for(int i = 1; i <= turn; i++) {
			int[] arr = game();
			Integer num = 0;
			if(arr[0] == 1) {
				num = hashWin.getOrDefault(arr[1], 0);
				num++;
				hashWin.put(arr[1], num);
				System.out.print(hashWin.get(arr[1]));
			} else {
				num = hashLose.getOrDefault(arr[1], 0);
				num++;
				hashLose.put(arr[1], num);
				System.out.print(hashWin.get(arr[1]));
			}	
		}
	}
	
	public static void winAnalysis() {
		Set<Integer> set = hashWin.keySet();		
		int sum = 0;
		for(Integer dice:set) {
			if(dice < 21) {
				System.out.printf("turn:%d  times:%d%n",dice,hashWin.get(dice));
			} else {
				sum += hashWin.get(dice);
			}		
		}
		System.out.printf("turn:over20  times:%d",sum);
	}
	
	public static void loseAnalysis() {
		Set<Integer> set = hashLose.keySet();		
		int sum = 0;
		for(Integer dice:set) {
			if(dice < 21) {
				System.out.printf("turn:%d  times:%d%n",dice,hashLose.get(dice));
			} else {
				sum += hashLose.get(dice);
			}		
		}
		System.out.printf("turn:over20  times:%d",sum);
	}
	
	public static void main(String[] args) {
		
		gameStart(100);
		winAnalysis();

	}

}
