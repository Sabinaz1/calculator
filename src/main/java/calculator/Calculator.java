package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {
      double a = Double.parseDouble(expression[0]); //first 1
        String op = expression[1]; // op +
        double b = Double.parseDouble(expression[2]);
        double result;
        switch (op) {
            case "+": result = a + b;
                break;
            case "-": result = a - b;
                break;
            case "*": result = a * b;
                break;
            case "/": result = a / b;
                break;

            default:
                result = 0;

        }
        return Double.toString(result);
    }
}

