package zadanie04;

import java.util.Arrays;

public class Calculator {

    private String[] operations;

    public Calculator() {
        this.operations = new String[0];
    }

    private void addToOperations(String operation){
        this.operations = Arrays.copyOf(this.operations,this.operations.length + 1);
        this.operations[this.operations.length - 1] = operation;
    }

    public double add(double num1, double num2){
        double result = num1 + num2;
        String operation = "added " + num1 + " to " + num2 + " got " + result;
        addToOperations(operation);
        return result;
    }

    public double multiply(double num1, double num2){
        double result = num1 * num2;
        String operation = "multiplied " + num1 + " with " + num2 + " got " + result;
        addToOperations(operation);
        return result;
    }

    public double subtract(double num1, double num2){
        double result = num1 - num2;
        String operation = "subtracted " + num1 + " from " + num2 + " got " + result;
        addToOperations(operation);
        return result;
    }

    public double divide(double num1, double num2){
        if ((num1 != 0) && (num2 != 0)){
            double result = num1 / num2;
            String operation = "divided " + num1 + " by " + num2 + " got " + result;
            addToOperations(operation);
            return result;
        } else {
            return 0;
        }
    }

    public void printOperations(){
        for (int i = 0; i < this.operations.length; i++){
            System.out.println(this.operations[i]);
        }
    }

    public void clearOperations(){
        this.operations = Arrays.copyOf(this.operations, 0);
    }
}
