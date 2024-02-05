
public class Hello {
  public static void main(String a[]) {
     int num[][] = new int[4][5];

     for(int i=0;i<4;i++) {
      for(int j=0;j<5;j++) {
        num[i][j] = (int)(Math.random()*10);
        System.out.print(num[i][j] + " ");
      }
      System.out.println();
     }

     for(int n[] : num) {
      for(int m: n)
      {
        System.out.println(m + " ");
      }
      System.out.println();
     }

}
}