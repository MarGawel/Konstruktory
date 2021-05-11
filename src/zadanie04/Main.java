package zadanie04;

public class Main {
    public static void main(String[] args) {

        double num1 = 2;
        double num2 = 2.5;

        Calculator calculator = new Calculator();

        calculator.add(num1, num2);
        calculator.multiply(num1, num2);
        calculator.divide(num1, 2);
        calculator.divide(0, 2);
        calculator.divide(2, 0);
        calculator.subtract(num1, num2);
        calculator.printOperations();
        calculator.clearOperations();
        System.out.println("teraz kasujemy");
        calculator.printOperations();

    }
}
