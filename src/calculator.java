import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1=input.nextDouble();
        char operator=input.next().charAt(0);
        double num2=input.nextDouble();
        double result;
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
                            result = num1 / num2;
                            break;
                            case '^':
                                result = Math.pow(num1, num2);
                                break;
            case '%':
                                result = num1 % num2;
                                break;
                                default:
                                    System.out.println("Invalid operator");
                                    return;

        }
        System.out.println("The result is: " + result);
        input.close();
    }
}
