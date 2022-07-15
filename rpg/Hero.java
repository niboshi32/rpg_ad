package rpg;

public class Hero extends Character{
	public void attack() {}
	public void weaponAttack(String eName,int eHp) {
		System.out.println(getName() + "の武器攻撃！");
		System.out.println(eName+"に１０のダメージ");
		eHp-=10;

	}
	public void item() {

	}

	public Hero() {
		setHp(100);
		setMp(100);
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
