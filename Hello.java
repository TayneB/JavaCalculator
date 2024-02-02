class Computer
{
  public void playMusic() {
    System.out.println("Playing music");
  }

  public String getMeAPen(int cost) {
    return "Pen";
  }
}

public class Hello {
  public static void main(String a[]) {
      Computer obj = new Computer();
      obj.playMusic();
      String str = obj.getMeAPen(10);
      System.out.println(str);
  }
}