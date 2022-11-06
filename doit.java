public class doit {
  public static void main(String[] args) {
    for (int q = 1; q <= 9; q++) {
      if (q % 2 > 0) continue;
        for (int w = 1; w <= 9; w++) {
          System.out.println(q + "X" + w + "=" + q * w);
        }
      System.out.println(); 
    } // 짝수 구구단 출력

          int dan, gob;
          for (dan = 1; dan <= 9; dan++) {
            for (gob = 1; gob <= 9; gob++) {
              if (dan < gob) break;
              {
                System.out.println(dan + "X" + gob + "=" + dan * gob);
        }
      }
      {
        System.out.println();
      }
    } // 단보다 곱하는 수가 작거나 같은 구구단 출력

  }
}
