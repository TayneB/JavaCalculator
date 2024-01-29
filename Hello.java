public class Hello {
  public static void main(String a[]) {
      String day = "Monday";
      String result = "7am";

      result = switch (day) {
          case "Saturday", "Sunday" -> "6am";
          case "Monday" ->  "8am";
          default -> "7am";
      };

      System.out.println(result);
  }
}