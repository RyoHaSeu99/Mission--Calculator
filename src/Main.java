import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double result;
        char more;
        char operator;
        boolean stop = true;


        System.out.print("숫자를 입력하세요: ");
        result = scanner.nextDouble();

        while (stop) {
            num1 = result;

            System.out.print("연산자를 입력하세요(+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+' :
                    result += num2;
                    break;

                case '-' :
                    result -= num2;
                    break;

                case '*' :
                    result *= num2;
                    break;

                case '/' :
                    if (num2 != 0) {
                        result /= num2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                    break;

                default :
                    System.out.println("+, -, *, / 중에서 입력해주세요.");
                    continue;
            }

            System.out.printf("%f %c %f = %f\n", num1, operator, num2, result);

            System.out.println("더 계산하시겠습니까?(y / n): ");
            more = scanner.next().charAt(0);

            if (more == 'n' || more == 'N') {
                stop = false;
            }

        }


    }
}