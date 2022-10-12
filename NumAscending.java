import java.util.Scanner;
public class NumAscending {
  public static void run() {
    // Declaring & initialising var
    int num, t1, t2, y=0, x, i=0;
    Scanner sc = new Scanner(System.in);

    // Taking user input
    System.out.print("\n\nEnter a number: ");
    num = sc.nextInt();
    
    // Counting number of digits
    t1 = num;
    t2 = num;
    
    while(t1 > 0) {
      y = 0;
      i = 0;
      
      while(t2 > 0) {
        y += (((Math.min((t2 % 100)/10, (t2 % 100)%10) * 10) + Math.max((t2 % 100)/10, (t2 % 100)%10)) * (int)Math.pow(10, i*2));
        t2/=100;
        i++;
      }
      
      t2 = y/10;
      y = y % 10;
      i = 0;
      
      while(t2 > 0) {
        y += (((Math.min((t2 % 100)/10, (t2 % 100)%10) * 10) + Math.max((t2 % 100)/10, (t2 % 100)%10)) * (int)Math.pow(10, i*2) * 10);
        t2/=100;
        i++;
      }
      
      t2 = y;
      t1/=10;
    }
    
    System.out.println("New Number = "+y);
  }
}