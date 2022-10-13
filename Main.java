// Ignore this program

import java.util.Scanner;

public class Main {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {
    menu();
    //new DateValidation().test();
  }

  public static void menu() {
    boolean repeat = false;
    Scanner sc = new Scanner(System.in);
    String options = "\n ************************************************************** \n\n" +
        "1. Swap consecutive pair of digits of even digits number.\n" +
        "2. Rearranging a number in ascending order.\n" +
        "3. Break-up a number in descending order of denomination in rupees\n" +
        "4. Number in Words (limit One Lakh - 1,00,000).\n" +
        "5. Check if the date is valid or not.\n" +
        "Choose a program (1-5): ";

    do {
      System.out.print(options);
      int option = sc.nextInt();
      System.out.println("\n ************************************************************** \n\n");

      switch (option) {
        case 1:
          System.out.print("1. Int Type\n2. String Type\nChoose a program (1-2): ");
          switch (sc.nextInt()) {
            case 1:
              new src().EvenDigitNumSwapInt();
              new IEvenDigitNumSwap().run();
              break;

            case 2:
              System.out.println("\n ************************************************************** \n\n");
              new SEvenDigitNumSwap().run();
              // new src().EvenDigitNumSwapString();
              break;
          }
          break;

        case 2:
          new SmallestNum().run();
          break;

        case 3:
          new RupeeCounter().run();
          break;

        case 4:
          new NumWord().run();
          break;

        case 5:
          //new DateValidation().run();
          break;

        default:
          System.out.println("Incorrect input");
          break;
      }

      System.out.print(
          "\n ************************************************************** \n\nDo you want to repeat the program (true or false): ");
      repeat = sc.nextBoolean();
    } while (repeat);
  }
}