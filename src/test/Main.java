package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Seasons season = null;
		
		System.out.println("季節を入力してください");
		String input = sc.nextLine();

		try {
			season = Seasons.valueOf(input);
		} catch (IllegalArgumentException e) {
			System.out.println("入力された値が正しくありません");
			e.printStackTrace();
		}
		
		System.out.println(season.getSeason());
	}
}
