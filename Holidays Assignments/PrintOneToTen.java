public class PrintOneToTen {
  
  public static void printForwardUsingWhile(int i, int j) {
    
    System.out.println("Printing from " + i + " to " + j + " using While in Forward Direction : ");
    while(i <= j) {
      System.out.print(i++ + "\t");
    }
    System.out.println();
    System.out.println();
  }

  public static void printBackwardUsingWhile(int i, int j) {
    System.out.println("Printing from " + i + " to " + j + " using While in Backward Direction : ");
    while(j >= i) {
      System.out.print(j-- + "\t");
    }
    System.out.println();
    System.out.println();
  }

  public static void printForwardUsingDoWhile(int i, int j) {
    System.out.println("Printing from " + i + " to " + j + " using Do-While in Forward Direction : ");
    do {
      System.out.print(i++ + "\t");
    } while(i <= j);
    System.out.println();
    System.out.println();
  }
  
  public static void printBackwardUsingDoWhile(int i, int j) {
    System.out.println("Printing from " + i + " to " + j + " using Do-While in Backward Direction : ");  
    do {
      System.out.print(j-- + "\t");
    } while(j >= i);
    System.out.println();
    System.out.println();
  }

  public static void main(String[] args) {
    int i = 1;
    int j = 10;

    printForwardUsingWhile(i, j);
    printBackwardUsingWhile(i, j);
    printForwardUsingDoWhile(i, j);
    printBackwardUsingDoWhile(i, j);
    
  }


}