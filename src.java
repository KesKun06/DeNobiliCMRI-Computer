// Ignore this program

public class src {
  public void EvenDigitNumSwapInt() {
    System.out.println("\n\n ************************************************************** \n"+
    "Source Code: IEvenDigitNumSwap.java\n\n\n"+
    "{\n"+
    "// Declaring & initialising vars\n"+
    "int num, temp, i=0, x = 0, n = 0;\n"+
    "Scanner sc = new Scanner(System.in);\n"+
    "\n"+
    "// Taking user input\n"+
    "System.out.print(\"Enter a number with even digits: \");\n"+
    "num = sc.nextInt();\n"+
    "\n"+
    "// Counting number of digits\n"+
    "temp = num;\n"+
    "while (temp > 0) {\n"+
    "  temp /= 10;\n"+
    "  x++;\n"+
    "}\n"+
    "\n"+
    "// Checking Odd or Even\n"+
    "if (x % 2 == 0) {\n"+
    "  temp = num;\n"+
    "\n"+
    "  // Swaping pair of digits\n"+
    "  while (temp > 0) {\n"+
    "    x = temp % 100;\n"+
    "    n = n+(((x % 10) * 10 + (x / 10)) * (int)Math.pow(10, i*2));\n"+
    "    temp /= 100;\n"+
    "    i++;\n"+
    "  }\n"+
    "\n"+
    "  System.out.print(\"\\nNumber after swaping consecutive pair of digits : \" + n);\n"+
    "} else\n"+
    "  System.out.print(\"\\n\"+num + \" is not an even digit number.\");\n"+
    "}\n"+
    "\n ************************************************************** \n\n");
  }
}