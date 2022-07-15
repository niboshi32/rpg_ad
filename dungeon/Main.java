package dungeon;

import labyrinth.Labyrinth;

public class Main {
   /*設計
    *プレイヤー駒を操作しゴールを目指すゲーム
	*用意するもの
	*ダンジョンマップ
	*スタートとゴールを設定
	*
	*プレイヤー
	*プレイヤーデータ
	*プレイヤー移動メソッド
	*
	*ゴーレム
	*ゴーレムデータ
	*ゴーレム移動メソッド
	*
	*エンカウント時展開するメソッド
	*
	*ランダムエンカウント
	*プレイヤーが動くたびに発生し
	*スライムを呼び出し戦闘する
	*
	*シンボルエンカウント
	*プレイヤーとゴーレムが接触
	*プレイヤーとゴーレムが同じ場所意を参照した場合
	*ダメージ処理
	*
	*
	*理想の動き
	*プレイヤーをスタートに配置
	*ゴーレムをランダム配置（スポーン）
	*プレイヤー駒が動くたびにゴーレムもランダムに動く
	*プレイヤー駒が体力０にならずにゴールまで行くと勝利
	*パーティメンバー全員の体力が０になれば敗北
	*
	*多態性でパーティーをまとめる
	*CharacaterのＨＰで終了条件を示す
	*/

	/* パーティーで共有するもの
	 * クラスで静的フィールドを利用するstatic
	 *
	 *
	 */

	public Main() {
		Labyrinth m = new Labyrinth();
//		System.out.println(m.getDungeonB());

		//キャラクターの座標
		int i = 0;
		int j = 0;

//		m.setDungeonB(2,i ,j);

		/*int pl = 8;
		m.setDungeonB(pl,i,j);

		String move = new java.util.Scanner(System.in).nextLine();
		switch(move) {
			case "a" :i--;
			break;
			case "d" :i++;
			break;
			case "w" :j--;
			break;
			case "s" :j++;
			break;
		}
	*/

	/*モンスター徘徊用
	 *
		int i = 0;
		int j = 0;

		m.setDungeonB(2,i ,j);
	*/
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
