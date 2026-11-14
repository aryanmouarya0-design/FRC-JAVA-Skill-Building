package module15;

public class exercise2_15 {
    public static void MathHelper(int num1, int num2, char operator) {
        float result;
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
                    result = (float) num1 / num2;
                } else {
                    result = Float.NaN;
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                result = Float.NaN;
                System.out.println("invalid operator");
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    public static void main(String[] args) {
        MathHelper(78, 99, '+');
    }
}
