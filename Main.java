// Ignore this program

import java.util.Scanner;

public class Main {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {
    menu();
  }

  public static void menu() {
    boolean repeat = false;
    Scanner sc = new Scanner(System.in);
    String options = "1. Creating a new number by swaping consecutive pair of digits of even digits number.\n" +
        "2. Creating a new number by rearranging the given number in ascending order.\n" +
        "Choose a program (1-2): ";

    do {
      System.out.print(options);
      int option = sc.nextInt();
      System.out.println("\n ************************************************************** \n\n");

      switch (option) {
        case 1:
          System.out.print("1. Int Type\n2. String Type\nChoose a program (1-2): ");
          switch (sc.nextInt()) {
            case 1:
              new EvenDigitNumSwap().intType();
              System.out.println(
                  "\n ************************************************************** \nSource Code: EvenDigitNumSwap.java\n");
              new src().EvenDigitNumSwapInt();
              break;

            case 2:
              new EvenDigitNumSwap().stringType();
              break;
          }
          break;

        case 2:
          new NumAscending().run();
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