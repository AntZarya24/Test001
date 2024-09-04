import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson08_keys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Калькулятор целых чисел от 1 до 10 :");
        String str = scan.nextLine();
        try {
            String answer = calc(str);
            System.out.println(answer);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public static String calc(String str)
        throws Exception {
        String[] part = str.split(" ");
        if (part.length != 3) {
            throw new Exception("Некорректный формат выражения");
        }
        int a = Integer.parseInt(part[0]);
        int b = Integer.parseInt(part[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("Числа долджны быть от 1 до 10");
        }
        char operator = part[1].charAt(0);
        int answer;
        switch (operator){
            case '+':
          answer = a + b;
          break;
            case '-':
          answer = a - b;
          break;
            case '*':
          answer = a * b;
          break;
            case '/':
          answer = a / b;
          break;
            default:
                throw new Exception("Неподдерживаемая операция");
        }
        return String.valueOf(answer);
    }
}

