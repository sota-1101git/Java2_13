import java.util.Scanner;

public class CalculaterApp {
    public static void main(String[] args) {
        Calculater calc = new Calculater();
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("- 電卓アプリケーション -");
        System.out.println("----------------------");

        System.out.println("\n 実行する計算を1つ選んで数字で答えてください。");
        System.out.println("1：足し算");
        System.out.println("2：引き算");
        System.out.println("3：掛け算");
        System.out.println("4：割り算");
        System.out.println("5：平方数");
        System.out.println("6：階乗");
        System.out.println("7：素数判定");

        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("1つ目の数字を入力してください");
            double argument1 = scanner.nextDouble();
            System.out.println("2つ目の数字を入力してください");
            double argument2 = scanner.nextDouble();
            calc.add(argument1, argument2);

        } else if (input == 2) {
            System.out.println("1つ目の数字を入力してください");
            double argument1 = scanner.nextDouble();
            System.out.println("2つ目の数字を入力してください");
            double argument2 = scanner.nextDouble();
            calc.sub(argument1, argument2);

        } else if (input == 3) {
            System.out.println("1つ目の数字を入力してください");
            double argument1 = scanner.nextDouble();
            System.out.println("2つ目の数字を入力してください");
            double argument2 = scanner.nextDouble();
            calc.mul(argument1, argument2);

        } else if (input == 4) {
            System.out.println("1つ目の数字を入力してください");
            double argument1 = scanner.nextDouble();
            System.out.println("2つ目の数字を入力してください");
            double argument2 = scanner.nextDouble();
            calc.div(argument1, argument2);

        } else if (input == 5) {
            System.out.println("数字をひとつ入力してください");
            double argument = scanner.nextDouble();
            calc.squareNumber(argument);

        } else if (input == 6) {
            System.out.println("正の整数をひとつ入力してください");
            int argument = scanner.nextInt();
            calc.factorial(argument);

        } else if (input == 7) {
            System.out.println("正の整数をひとつ入力してください");
            int argument = scanner.nextInt();
            calc.primeCheck(argument);

        } else {
            System.out.println("1 ～ 7 を選んでください。");
        }

        scanner.close();
    }
}


