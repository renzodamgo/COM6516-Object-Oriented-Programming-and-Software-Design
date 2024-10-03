import java.io.IOException;
import sheffield.EasyReader;

public class CycleComputer {
  public static void main( String[] arg) {
    EasyReader timings = new EasyReader("timings.txt");
    double distance = Math.PI * 0.665; // Distance in meters
    try {
      String a = timings.readLine();
      System.err.println("Reading from timings.txt");
      System.out.println("You entered a=" + a);
      String time1 = timings.readLine();
      double tms = distance / Double.parseDouble(time1);
      System.out.printf("%.2f km/h\n", tms * 3.6);

      timings.close();
    } catch (IOException e) {
      System.err.println("Error reading from timings.txt");
    }
    
   

  }
}
