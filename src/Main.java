public class Main {
    public static void main(String[] args) {
        // Вычисление n-ого треугольного числа
        int n = 10;
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }
        System.out.println("Triangle number " + n + " is " + triangleNumber);

        // Вычисление факториала n
        n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);

        // Вывод простых чисел от 1 до 1000
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Простой калькулятор
        int a = 10;
        int b = 5;
        char operator = '+';
        int result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}
