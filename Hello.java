class Calculator 
{
  int a;
  public int add() {
    System.out.println("Addition");
    return 0;
  }
}

public class Hello {
  public static void main(String a[]) {
      
    int num1=4;
    int num2=5;

    Calculator calc = new Calculator();

    calc.add();

    // int result=num1+num2;

    // System.out.println(result);
  }
}