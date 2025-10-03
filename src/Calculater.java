public class Calculater {
    // 足し算
    void add(double decimalAdd1, double decimalAdd2) {
        double answer = decimalAdd1 + decimalAdd2;
        System.out.println(answer);
    }

    // 引き算
    void sub(double decimalSub1, double decimalSub2) {
        double answer = decimalSub1 - decimalSub2;
        System.out.println(answer);
    }

    // 掛け算
    void mul(double decimalMul1, double decimalMul2) {
        double answer = decimalMul1 * decimalMul2;
        System.out.println(answer);
    }

    // 割り算
    void div(double decimalDiv1, double decimalDiv2) {
        if (decimalDiv2 == 0) {
            System.out.println("0では割れません");
        } else {
            double answer = decimalDiv1 / decimalDiv2;
            System.out.println(answer);
        }
    }

    // 平方数
    void squareNumber(double decimal) {
        double answer = decimal * decimal;
        System.out.println(answer);
    }

    // 階乗
    void factorial(int number) {
        int answer = 1;
        while (number != 1) {
            answer *= number;
            number--;
        }
        System.out.println(answer);
    }

    // 素数判定
    void primeCheck(int number) {
        if (number <= 1) {
            System.out.println(number + " は素数ではありません");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " は素数です");
        } else {
            System.out.println(number + " は素数ではありません");
        }
    }
}
