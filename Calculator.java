public class Calculator {
    public static void main(String[] args) {
        String num1 = (System.console().readLine());
        int num2 = 10;
        int num3 = 10000;
        int num4 = 1026;
        
        int sum = Integer.parseInt(num1) + num2;
        int difference = Integer.parseInt(num1) - num2;
        int quotient = Integer.parseInt(num1) / num2;
        int product = Integer.parseInt(num1) * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
        System.out.println("Product: " + product);
    }
}
