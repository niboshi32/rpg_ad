package labyrinth;

public class Labyrinth {
	private int[][] labyrinth = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
	
//	private String[][] labyrinth = {{"□","□","□","□","□"},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};

	public int[][]getLabyrinth() {return this.labyrinth;}
	public int getLabSel(int x,int y){return this.labyrinth[x][y];};

	public void setLabyrinth(int n,int i,int j) {
		this.labyrinth[i][j] = n;
	}

	public void veiw() {
		for(int[] map :getLabyrinth() ) {
			for(int j = 0; j<getLabyrinth().length ; j++ ) {
				System.out.print(map[j] + "  ");
			}
			System.out.println();
		}
	}

	public Labyrinth() {
		this.getLabyrinth();


		// TODO 自動生成されたコンストラクター・スタブ
	}

}
