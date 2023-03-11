import java.util.Random;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Random random = new Random();
      Scanner scanner = new Scanner(System.in);
      System.out.print("имя'");
      String kill = scanner.nextLine();
      System.out.print("фамиля");
      String mill = scanner.nextLine();
      int oo = random.nextInt(22, 200);
      System.out.println(kill + mill + "\t" + oo);
   }
}