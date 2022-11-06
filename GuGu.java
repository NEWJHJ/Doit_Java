public class GuGu { // 소스파일명 클래스명 동일사용
  public void dan(int n) {
    for (int i = 1; i < 10; i++) { //for(초기치; 조건문; 증가치) {수행문}
      System.out.println(n * i);
    }
//    System.out.println(n * 1);
//    System.out.println(n * 2);
//    System.out.println(n * 3);
//    System.out.println(n * 4);
//    System.out.println(n * 5);
//    System.out.println(n * 6);
//    System.out.println(n * 7);
//    System.out.println(n * 8);
//    System.out.println(n * 9);
  }

  public static void main(String[] args) {
    GuGu gugu = new GuGu(); // new 새로운 객체 생성기 ex) int i = 2
    for (int i = 1; i < 10; i++) { //for(초기치; 조건문; 증가치) {수행문}
      gugu.dan(i);
//    gugu.dan(2);
//    gugu.dan(3);
//    gugu.dan(4);
//    gugu.dan(5);
//    gugu.dan(6);
//    gugu.dan(7);
//    gugu.dan(8);
//    gugu.dan(9);
    }
  }
}