public class StatementsUtil {
  public static boolean even(int x) {
    return x % 2 == 0;
  }
  public static boolean positive(int x) {
    return x > 0;
  }
  public static boolean range(int x) {
    return (x > 5 && x < 8) || (x > 15 && x < 20);
  }
  public static boolean divide(int x) {
    return x % 5 == 0 && x % 7 == 0;
  }
  public static boolean seven(int x) {
    int abs = Math.abs(x);
    if (abs < 100 || abs > 999) {
      System.out.println("Wrong number");
      return false;
    }
    return (abs / 10) % 10 == 7;
  }
  public static boolean circle(double x, double y, double r) {
    double dx = x - 0;
    double dy = y - 5;
    return dx * dx + dy * dy < r * r;
  }
  public static int max3(int a, int b, int c) {
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    return max;
}
  public static boolean year(int year) {
    if (year % 400 == 0) {
      return true;
    }
    if (year % 100 == 0) {
      return false;
    }
    return year % 4 == 0;
  }
  public static void print1() {
    for (int i = 1; i <= 200; i++) {
      System.out.println(i);
    }
  }
  public static void print2(int x) {
    int n = Math.abs(x);
    while (n >= 10) {
      n /= 10;
    }
    System.out.println(n);
  }
  public static void print3() {
    int x = 1;
    int y = 0;
    while (x < 5 && y < 10) {
      System.out.println(x + y);
      x++;
      y++;
    }
  }
  public static void main(String[] args) {
    System.out.println("Task 1: " + even(8));
    System.out.println("Task 2: " + positive(-3));
    System.out.println("Task 3: " + range(17));
    System.out.println("Task 4: " + divide(70));
    System.out.println("Task 5: " + seven(974) + ", " + seven(846));
    System.out.println("Task 6: " + circle(1, 6, 3));
    System.out.println("Task 7: " + max3(4, 9, 6));
    System.out.println("Task 8: " + year(2024) + ", " + year(1900));
    System.out.println("Task 11: ");
    print1();
    System.out.println("Task 12: ");
    print2(7345);
  }
}ыa
