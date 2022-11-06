
public class doit2 {
  public static void main(String[] args) {

//    while(a <= b) {
//      System.out.print("*");
//      a++;
//    }
//     System.out.println(" "); //한 줄

      int i = 3;
    for (int e = 1; e <= 7; e += 2) {
      for (int d = 1; d <= i; d++) {
        System.out.print(" ");
      }
      --i;
      for (int f = 1; e >= f; f++) {
        System.out.print("*");
      }
      System.out.println();
    } // 피라미드


    for (int e = 1; e <= 4; e += 1) {
        for (int d = 1; d <= 4 - e; d++) {
          System.out.print(" ");
        }
        for (int f = 1; e * 2 - 1 >= f; f++) {
          System.out.print("*");
        }
     System.out.println();
    }
    for (int e = 3; e >= 1; e -= 1) {
      for (int d = 3; d >= e; d--) {
        System.out.print(" ");
      }
      for (int f = 1; e * 2 - 1 >= f; f++) {
        System.out.print("*");
      }
      System.out.println();
    } // 마름모


  }
}