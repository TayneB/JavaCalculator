public class Hello {
  public static void main(String a[]) {

    int i = 1;
      
    while(i < 4){
      System.out.println("Hi " + i);
      int j = 1;
      while(j<=3) {
      System.out.println("Hello World");
      j++;
      }
      i++;
    }

    System.out.println("bye " + i);
  }
}