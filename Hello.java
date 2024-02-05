class Calculator
{
  public int add(int n1, int n2) {
    return n1 + n2;
  }
}

public class Hello {
  public static void main(String a[]) {
      Calculator calc = new Calculator();
      int result = calc.add(10, 20);
      System.out.println(result);
  }
}