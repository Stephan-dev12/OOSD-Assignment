public class Calculator {
    public static void main(String[] args) {
        String num1 = (System.console().readLine());
        int num2 = 5;

        int sum = Integer.parseInt(num1) + num2;
        int difference = Integer.parseInt(num1) - num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
