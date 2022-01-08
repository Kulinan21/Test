import java.util.Scanner;
import java.util.InputMismatchException;

public class NewCalculator {
    static Scanner scanner = new Scanner(System.in);
    private String operation;

    public static void main(String[] args) {
        NewCalculator calculator = new NewCalculator();
        calculator.calculate();
    }

    public void calculate(){
            try {
                System.out.println(calculationStep());
            } catch (InputMismatchException ex){
                System.out.println("Wrong input data!");
            }
    }

    private int calculationStep() throws InputMismatchException {
        System.out.println("Enter first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter operation");

        operation = scanner.nextLine();

        return performOperation(firstNumber, secondNumber);
    }

    private int performOperation(int firstNumber, int secondNumber) {
        int result;

        switch (operation){
            case "+":
                result = plus(firstNumber, secondNumber);
                break;
            case "-":
                result = minus(firstNumber, secondNumber);
                break;
            case "*":
                result = mnozh(firstNumber, secondNumber);
                break;
            case "/":
                result = dil(firstNumber, secondNumber);
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }

    private int plus(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    private int minus(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    private int mnozh(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    private int dil(int numberOne, int numberTwo){
        return numberOne / numberTwo;
    }

}