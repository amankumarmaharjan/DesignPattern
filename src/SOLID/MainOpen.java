package SOLID;

public class MainOpen {
    public static void main(String[] args) {

        Calculator calculator= new Calculator();
        calculator.calculate(new Addition(1,2));
        calculator.calculate(new Subtraction(3,4));
        calculator.calculate(new Division(2,3));
        calculator.calculate(new Division(2,3));
    }
}
