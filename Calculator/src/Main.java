import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Введите действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        int res;


        switch (action){
            case "+":
               res = num1 + num2;
                System.out.println("Результат: " + res);
               break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("На нуль делить нельзя!");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
            default:
                System.out.println("Вы ввели что-то не так...");
        }


    }

}