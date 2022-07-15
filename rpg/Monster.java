package rpg;

public abstract class Monster {
	//多態性により行動責任を持たせるためのデータを管理
	//共通のデータと固有のデータを持たせて
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

	public Monster() {
		// TODO 自動生成されたコンストラクター・スタブ
		
	}

}
