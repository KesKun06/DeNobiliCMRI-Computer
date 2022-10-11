import java.util.Scanner;
public class EvenDigitNumSwap {
  public void intType() {
    // Declaring & initialising var
    int num, temp, i=0, x = 0, n = 0;
    Scanner sc = new Scanner(System.in);

    // Taking user input
    System.out.print("\n\nEnter a number with even digits: ");
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
      
      while (temp > 0) {
        x = temp % 100;
        n = n+(((x % 10) * 10 + (x / 10)) * (int)Math.pow(10, i*2));
        temp /= 100;
        i++;
      }

      System.out.print("\n" + num
          + " is an even digit number.\nThe new number formed after swaping consecutive pair of digits is: " + n);
    } else
      System.out.print(num + " is not an even digit number.");
  }

  
  public void stringType() {
    // Declaring & initialising var
    int num, temp, x = 0;
    String n = "";
    Scanner sc = new Scanner(System.in);

    // Taking user input
    System.out.print("\n\nEnter a number with even digits: ");
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
      
      while (temp > 0) {
        x = temp % 100;
        n = ((x % 10) * 10 + (x / 10)) + n;
        temp /= 100;
      }

      System.out.print("\n" + num
          + " is an even digit number.\nThe new number formed after swaping consecutive pair of digits is: " + n);
    } else
      System.out.print(num + " is not an even digit number.");
  }
}