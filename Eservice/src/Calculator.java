import java.util.Scanner;

public class Calculator implements Main {

    Scanner scanner = new Scanner(System.in);
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();
    double result1;
    double result2;
    double result3;
    double result4;

    @Override
    public void Sum() {
       result1 = num1+num2;
    }

    @Override
    public void Mul() {
        result2 = num1*num2;
    }

    @Override
    public void Div() {
       result3 = num1/num2;
    }

    @Override
    public void Sub() {
       result4 = num1-num2;
    }
}
