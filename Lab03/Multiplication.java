
public class Multiplication {
  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        int n = i * j;
        if (n > 9) {
          System.out.printf("%d\t", i * j);

        } else {
          System.out.printf(" %d\t", i * j);
        }

      }
      System.out.println("");

    }
  }
}
