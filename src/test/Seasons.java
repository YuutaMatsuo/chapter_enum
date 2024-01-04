package test;

public enum Seasons {
	// 列挙定数を宣言
	SPRING("春")
	,SUMMER("夏")
	,FALL("秋")
	,WINTER("冬")
	;
	
	// 紐づけデータを格納するための「定数フィールド」
	private final String season;
	
	// 内部コンストラクタ(シングルトン)
	private Seasons(final String season) {
		this.season = season;	
	}
	
	// toString()のオーバーライド
	public String toString() {
		return name() + "です"; // name()の呼び出し
	}
	
	// 紐づけデータ取得用
	public String getSeason() {
		return season;
	}
}
