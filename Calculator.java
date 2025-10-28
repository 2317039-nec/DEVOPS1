public class Calculator {
    public static void main(String[] args) {
        // Check if we got 3 arguments: num1, num2, operator
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <num1> <num2> <operator>");
            return;
        }

        // Read inputs
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        char op = args[2].charAt(0);
        double result = 0;

        // Perform operation
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator! Use +, -, *, or /");
                return;
        }

        // Print result
        System.out.println("Result: " + result);
    }
}
