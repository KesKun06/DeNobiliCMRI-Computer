import java.util.Scanner;
public class SEvenDigitNumSwap {
  public void run() {
    // Declaring & initialising var
    int num, temp, x = 0;
    String n = "";
    Scanner sc = new Scanner(System.in);

    // Taking user input
    System.out.print("Enter a number with even digits: ");
    num = sc.nextInt();

    // Counting number of digits
    temp = num;
    while (temp > 0) {
      temp /= 10;
      x++;
    }

    // Checking Odd or Even
    if (x % 2 == 0) {
      temp = num;

      // Swaping pair of digits
      while (temp > 0) {
        x = temp % 100;
        n = ((x % 10) * 10 + (x / 10)) + n;
        temp /= 100;
      }

      System.out.print("\nNumber after swaping consecutive pair of digits : " + n);
    } else
      System.out.print("\n"+num + " is not an even digit number.");
  }
}