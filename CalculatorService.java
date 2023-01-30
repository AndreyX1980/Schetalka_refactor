package model;

public class CalculatorService implements Calculator  {
    public CalculatorService() {}

    public double calculate(double num1, double num2, int operator){
        double result = 0;

        switch (operator){
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num1 % num2;
                break;
            case 6:
                result = 1/num1;
                break;
        }
            
        return result;
    }
}