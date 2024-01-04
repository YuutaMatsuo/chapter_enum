package enum_sample;

public class Main {
	public static void main(String[] args) {
		String seasonStr = "SPRING"; //不当な値が入る可能性あり！
		Seasons season01 = Seasons.SPRING; 
//		Seasons season02 = Seasons.HELLO; // 列挙定数ではないのでエラーとなる
		
		System.out.println(seasonStr);
		System.out.println(season01.getSeason());
		System.out.println(season01); // toString()の呼び出し
		System.out.println(season01.name());
	}
}
