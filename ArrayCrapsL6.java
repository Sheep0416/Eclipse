/*
 * l6.(*)Craps��չC��.
 *	�Ѫ��a(player)�Ĥ@���Y������l,��l�M�Y��7��11,�h���aĹ(win).
 *	�Y�M��2,3,12,�h���a(house)Ĺ.�Y�M��4,5,6,8,9,10,�h�M�������a�I��.
 *	���U�Ӫ��a�����~���Y������l,������e�I�ƭ��s�X�{(�Y�o�I)����.
 *	�o�I�e,�Y���a�Y�X7,�Y��駽(lose).
 *	�мg�@�{��,�s��������C����Ĺ10000��,�òέp��Ĺ���v.
 *  (��:�ѹq�������L�{�i�^���U�C���D:
 *	�@�B���h�֦��O�b�Ĥ@���Y��B�ĤG���Y��B�K�B�ĤG�Q���Y��B�ĤG�Q���H�W�Y����Ӫ��H
 *	�G�B���h�֦��O�b�Ĥ@���Y��B�ĤG���Y��B�K�B�ĤG�Q���Y��B�ĤG�Q���H�W�Y��鵹���a���H
 *  �T�B��CRAPS��չC����Ӫ����v�O�h�֡H(��:craps���٬O�̤�����դ��@,�Aı�o�O)
 *  �|�B�����C����Ĺ�ݭn�Y��X���H
 *  ���B�C������Ӫ����v�O�_�H���Y�릸�ƪ��W�[�ӼW�[�H
 *  ���B���������Ʀh����A�W���X�Ӱ��D�����׬O�_���v�T�H��v�T�p��H
 *  �H�W���D���K��http://www.ame.ntu.edu.tw/~ttlin/newpage54.htm)
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
