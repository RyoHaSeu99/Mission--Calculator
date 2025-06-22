import java.util.Scanner;

class Calculation {
    double num1;
    double num2;
    double result;
    char operator;

    public Calculation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    // 생성자 없이 오버로딩으로? 아니면 숫자만 생성자로 받기? 근데 생성자 게속 반복하면 계속 새로운 객체만 생긴다? 메모리 이슈?

    public double Calculate(char operator) {
        switch (operator) {
            case '+':
                result = num1 + num2;
            break;

            case '-':
                result = num1 - num2;
            break;

            case '*':
                result = num1 * num2;
            break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;

//            default :
//                System.out.println("+, -, *, / 중에서 입력해주세요.");
//                continue;

        }

        return result;
    }
}

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static public int inputNumber() {
        System.out.print("숫자를 입력하세요: ");
        return scanner.nextInt();
    }

    static public char inputOperator() {
        System.out.print("연산자를 입력하세요(+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double result;
        char more;
        char operator;
        boolean stop = true;


        result = inputNumber();

        while (stop) {
            num1 = result;

            operator = inputOperator();
            num2 = inputNumber();

            Calculation calculation = new Calculation(num1, num2);
            result = calculation.Calculate(operator);

            System.out.printf("%f %c %f = %f\n", num1, operator, num2, result);

            System.out.println("더 계산하시겠습니까?(y / n): ");
            more = scanner.next().charAt(0);

            if (more == 'n' || more == 'N') {
                stop = false;
            }

        }
    }
}