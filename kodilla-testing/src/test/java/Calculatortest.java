import com.kodilla.testing.calculator.Calculator;

public class Calculatortest {
    public int add(int a, int b) {
        return (a + b);
    }

    public int subtract(int a, int b) {
        return (a - b);

    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(4, 2);
        int result2 = calculator.subtract(4, 2);

        if (result == 6) System.out.println("Test ok");
        else {
            System.out.println("Not ok");
        }
        if (result2 == 2) System.out.println("Test ok");

        else {
            System.out.println("Not ok");
        }


    }
}
