package labyrinth;

public class Main {
	/*迷路
	*
	*配列マップに
	*主人公のアイコン
	*
	*代入先が０なら代入できる
	*ランダムに障害物生成
	*	上の線と下の線からそれぞれ線が生えていき
	*	壁から生やして交わらないようにする
	*移動するたびに比較して
	*	i,j==0メソッド呼び出し
	*3ステージ用意し
	*大きさが５²、６²、７²と増えていく
	*繰り返していく
	*７²をクリアするとゲーム終了
	*/


	public static void main(String[]args) {
		Labyrinth d = new Labyrinth();

		//キャラクターの座標
		int x = 0;
		int y = 0;

		//ボスの座標
		int xb = 3;
		int yb = 3;
		d.setLabyrinth(3,xb,yb);
		
		int cnt = 0; 

		//スタートに配置
		d.setLabyrinth(8,x,y);
		System.out.println("");
		//ゴールを配置
		d.setLabyrinth(2,4,4);

		//モブの数を指定
//		System.out.println("障害物の数を入力してください");
//		int w = new java.util.Scanner(System.in).nextInt();
		//モブの数をランダム
		int w = new java.util.Random().nextInt(5);

		for(int i = 0 ; i < w ; i++) {
			int wallx = new java.util.Random().nextInt(5);
			int wally = new java.util.Random().nextInt(5);
			if(wallx -wally == 0 && wallx == 0 && wally == 0 && wallx-5 == 0) {
				i++;
			}else {
			d.setLabyrinth(1,wallx,wally) ;
			}
		}
		d.veiw();
		d.setLabyrinth(0,x,y);


		while(d.getLabSel(4,4) < 8) {
			d.setLabyrinth(0,x,y);

			//勇者の移動
			String move = new java.util.Scanner(System.in).nextLine();
			switch(move) {
				case "w" :x--;
				if(x < 0 ) {
					x++;
					System.out.println("そこは壁です、進めません");
				}
				break;
				case "s" :x++;
				if(x > 4) {
					x--;
					System.out.println("そこは壁です、進めません");
				}
				break;
				case "a" :y--;
				if(y < 0 ) {
					y++;
					System.out.println("そこは壁です、進めません");
				}
				break;
				case "d" :y++;
				if(y > 4) {
					y--;
					System.out.println("そこは壁です、進めません");
				}
				break;
			}
			
			if(d.getLabSel(x, y) == 1) {
				System.out.println("敵が現れた！");
				d.setLabyrinth(0,x,y);
			}else if(d.getLabSel(x, y) == 3) {
				System.out.println("迷宮の主が現れた！！");
				//ボス戦闘メソッドの呼び出し
				d.setLabyrinth(0,x,y);
			}
//				d.setLabyrinth(8,x,y);
//				d.veiw();
//				d.setLabyrinth(0,x,y);
//			}

			//ボスの移動
			//偶数なら移動
			if(cnt%2 == 0) {
				d.setLabyrinth(0,xb,yb);
				int moveB = new java.util.Random().nextInt(5);

				switch(moveB) {
					case 0 :xb--;
					if(xb < 0) {
						xb++;
					}
					break;
					case 1 :xb++;
					if(xb > 4) {
						xb--;
					}
					break;
					case 2 :yb--;
					if(yb < 0) {
						yb++;
					}
					break;
					case 3 :yb++;
					if(yb > 4) {
						yb--;
					}
					break;
				}
				
				d.setLabyrinth(3,xb,yb);
			}
			cnt++;
			//勇者移動
			d.setLabyrinth(8,x,y);
			//現時点のマップ
			d.veiw();

//			d.setLabyrinth(0,xb,yb);

		}
		System.out.println("無事迷宮を脱出した");

	}

}
