import java.util.Scanner;
class Calculator {
  public static void main(String a[]) {
    try (Scanner Calc = new Scanner(System.in)) {
      double num1, num2, result;
      String operator;
      System.out.println("Enter first number: ");
      num1 = Calc.nextDouble();
      System.out.println("Enter operator: ");
      operator = Calc.next();
      System.out.println("Enter second number: ");
      num2 = Calc.nextDouble();
      result = switch (operator) {
        case "+" -> num1 + num2;
        case "-" -> num1 - num2;
        case "*" -> num1 * num2;
        case "/" -> num1 / num2;
        case "%" -> num1 % num2;
        case "^" -> Math.pow(num1, num2);
        default -> throw new IllegalArgumentException("Invalid operator!");
      };
      System.out.println(result);
    }
}
}