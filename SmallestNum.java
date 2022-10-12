import java.util.Scanner;

public class SmallestNum {
  public void run() {
    // Declaring & initialising vars
    int num, t1, t2, y = 0, i;
    Scanner sc = new Scanner(System.in);

    // Taking user input
    System.out.print("\n\nEnter a number: ");
    num = sc.nextInt();

    t1 = num;
    t2 = num;

    // Running while-loop no. of digit in num times
    while (t1 > 0) {
      y = 0;
      i = 0;

      // Running while-loop no. of digit in num times &
      // Checking Maxmium and Minimum of every pair of no from right
      while (t2 > 0) {
        y += (((Math.min((t2 % 100) / 10, (t2 % 100) % 10) * 10) + Math.max((t2 % 100) / 10, (t2 % 100) % 10))
            * (int) Math.pow(10, i * 2));
        t2 /= 100;
        i++;
      }

      // Re-initialising vars
      t2 = y / 10;
      y = y % 10;
      i = 0;

      // Running while-loop no. of digit in num times &
      // Checking Maxmium and Minimum of every pair of no from right skipping one digit
      while (t2 > 0) {
        y += (((Math.min((t2 % 100) / 10, (t2 % 100) % 10) * 10) + Math.max((t2 % 100) / 10, (t2 % 100) % 10))
            * (int) Math.pow(10, i * 2) * 10);
        t2 /= 100;
        i++;
      }

      t2 = y;
      t1 /= 10;
    }

    System.out.println("Smallest Number possible : " + y);
  }
}