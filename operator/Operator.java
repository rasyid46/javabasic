public class Operator {
    public static void main(String args[]) {
      int a = 11;
      int b = 20;
      int c = 25;
      int d = 25;
      System.out.println("a + b = " + (a + b));
      System.out.println("a - b = " + (a - b));
      System.out.println("a * b = " + (a * b));
      System.out.println("b / a = " + (b / a));
      System.out.println("b"+b+" % a "+a+" = " + (b % a));
      System.out.println("c "+c+" % a "+a+" = " + (c % a));
      System.out.println("a++  = " + (a++));
      System.out.println("b--  = " + (a--));
  // Check the difference in d++ and ++d 
      System.out.println("d++  = " + (d++));
      System.out.println("++d  = " + (++d));
    }
  }