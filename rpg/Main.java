package rpg;

public class Main {

	public static void main(String[]args) {
		Hero h = new Hero();
		Wizard w = new Wizard();
		Slime sl1 = new Slime();
		Slime sl2 = new Slime();
		Madhand mh = new Madhand();

		System.out.println("冒険の始まり");
		System.out.println(sl1.getName() + "、" + sl2.getName() + "、"  + mh.getName() + "が現れた");

		//複数の敵の場合配列に入れる
		//配列に入れて選ぶ０、１，２，など
		String [] monsArrName = {sl1.getName(),sl2.getName(),mh.getName()};
		int[] monsarr = {sl1.getHp(),sl2.getHp(),mh.getHp()};

		//味方の攻撃→敵の攻撃
	
		while(h.getHp()>0 && w.getHp()>0) {
			//勇者の攻撃ターン
			System.out.println(h.getName() + "は技を選択してください");
			System.out.println("通常攻撃：１   武器攻撃：０");
			//String[] heroatk = {h.attack(),h.weaponAttack(null, null)};

			//パーティーメンバーがそれぞれ技を選択
			System.out.println("対象を選択してください");
			System.out.println(sl1.getName() + ":0 ," + sl2.getName() + ":1 ," + mh.getName() +":2 " );
			int atkChoise = new java.util.Scanner(System.in).nextInt();
			h.weaponAttack(monsArrName[atkChoise],monsarr[atkChoise]);

			//例、勇者→魔法法使い→僧侶
			System.out.println(w.getName() + "は技を選択してください");
			System.out.println("");

			// 物理と呪文
			// 攻撃する対象を選ぶ
			//対象としたモンスターを指定したダメージ計算メソッドが必要
			System.out.println("対象を選択してください");
			int choise = new java.util.Scanner(System.in).nextInt();
			if(choise == 1) {

			}


		}

	}
}
