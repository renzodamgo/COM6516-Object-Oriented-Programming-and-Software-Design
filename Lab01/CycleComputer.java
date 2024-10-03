import java.io.IOException;
import sheffield.EasyReader;

public class CycleComputer {
  public static void main(String[] arg) {
    EasyReader timings = new EasyReader("timings.txt");
    double distance = Math.PI * 0.665; // Distance in meters
    double maxSpeed = 0;
    int nCycles;
    double totalTime = 0;
    try {
      nCycles = Integer.parseInt(timings.readLine());
      double[] speeds = new double[nCycles];
      System.err.println("Number of cycles: " + nCycles);

      for (int i = 0; i < nCycles; i++) {
        String t = timings.readLine();
        double tms = distance / Double.parseDouble(t);
        speeds[i] = tms * 3.6;
        if (speeds[i] > maxSpeed) {
          maxSpeed = speeds[i];
        }
        totalTime += Double.parseDouble(t);
        // (a) The instantaneous speed for each rotation of the wheel in km/h.
        System.out.printf("(a) The instantaneous speed in rotation [%d] of the wheel in km/h: %.2f km/h\n", i + 1,
            tms * 3.6);
      }

      // (b) The maximum speed over the whole journey, in km/h.
      System.out.printf("(b) The maximum speed over the whole journey, in km/h.: %.2f km/h\n", maxSpeed);
      // (c) The total distance travelled during the journey, in km
      Double totalDistance = distance * nCycles / 1000;
      System.out.printf("(c) The total distance travelled during the journey, in km: %.2f km\n", totalDistance);
      // (d) The total time taken for the journey, in minutes.
      System.out.printf("(d) The total time taken for the journey, in minutes: %.2f minutes\n", totalTime / 60);

      timings.close();
    } catch (IOException e) {
      System.err.println("Error reading from timings.txt");
    }

  }
}
