import java.util.Scanner;

public class CalculaterApp {
	public static void main(String[] args) {
		Calculater calc = new Calculater();
		Scanner scanner = new Scanner(System.in);

		System.out.println("----------------------");
		System.out.println("-電卓アプリケーション-");
		System.out.println("----------------------");

		System.out.println("\n 実行する計算を1つ選んで数字で答えてください。");
		System.out.println("1：平方数を求める");
		System.out.println("2：階乗");

		int input = scanner.nextInt();

		if (input == 1) {
			System.out.println("数字をひとつ入力してください");
			double argument = scanner.nextDouble();
			calc.squareNumber(argument);
		} else if (input == 2) {
			System.out.println("正の整数をひとつ入力してください");
			int argument2 = scanner.nextInt();
			calc.factorial(argument2);
		} else {
			System.out.println("1 または 2 を選んでください。");
		}

		scanner.close();
	}
}
