import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstnum = getInt();
        int secondnum = getInt2();
        char operation = getOperation();
        int result = calculate(firstnum,secondnum,operation);
        System.out.println("Результат операції: " + result);
    }

    public static int getInt(){
        System.out.println("Введіть перше число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ви помилились при введенні числа. Спробуйте знову.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static int getInt2(){
        System.out.println("Введіть друге число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ви помилились при введенні числа. Спробуйте знову.");
            scanner.next();
            num = getInt2();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Виберіть операцію:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ви помилились при виборі операції. Спробуйте знову.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calculate(int firstnum, int secondnum, char operation){
        int result = 0;
        if(operation == '+'){
            result = firstnum + secondnum;
        }
        else if (operation == '-'){
            result = firstnum - secondnum;
        }
        else if (operation == '*'){
            result = firstnum * secondnum;
        }
        else if (operation == '/'){
            if (secondnum == 0){
                System.out.println("Ділення на нуль неможливе. Повторіть операцію!");
                result = calculate(getInt(), getInt2(), getOperation());
            }
            else {
                result = firstnum / secondnum;
            }
        }
        else {
            System.out.println("Операція відсутня. Спробуйте ще раз.");
            result = calculate(firstnum, secondnum, getOperation());
        }
        return result;

    }
}