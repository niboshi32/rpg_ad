package rpg;

public abstract class Character implements Creature {
	private String name;
	private int level;
	private int hp;
	private int mp;
	private int atk;

	public String getName() {return this.name;}
	public int getLevel() {return this.level;}
	public int getHp() {return this.hp;}
	public int getMp() {return this.mp;}
	public int getAtk() {return this.atk;}

	public void setName(String name) {this.name = name;}
	public void setLevel(int level) {this.level = level;}
	public void setHp(int hp) {this.hp = hp;}
	public void setMp(int mp) {this.mp = mp;}
	public void setAtk(int atk) {this.atk = atk;}

	public abstract void attack();
	public abstract void item();


	public Character() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
