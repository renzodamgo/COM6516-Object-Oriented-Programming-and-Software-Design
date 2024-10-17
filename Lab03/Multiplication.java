
public class Multiplication {
  public static void main(String[] args) {
    for (int k = 0; k <= 9; k++) {
      if (k == 0) {
        System.out.printf("    ", k);

      } else {
        System.out.printf(" %d  ", k);
      }
    }
    System.out.printf("\n----------------------------------------\n");

    for (int i = 1; i <= 9; i++) {
      for (int j = 0; j <= 9; j++) {
        int n = i * j;
        if (n == 0) {
          System.out.printf("%d | ", i);
        } else {
          if (n > 9) {
            System.out.printf("%d  ", n);

          } else {
            System.out.printf(" %d  ", n);
          }
        }

      }
      System.out.println("");

    }
  }
}
