package exercise3;

import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    do {
      if (a < (b + c) && b < (a + c) && c < (a + b)) {
        if (a == b && b == c) {
          double s = (a + b + c) / 2.0;
          double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
          System.out.println("Area: " + area);
          System.out.println("Triangle: equilateral");
          break;
        } else {
          if (a == b || b == c || a == c) {
          double s = (a + b + c) / 2.0;
          double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
          System.out.println("Area: " + area);
          System.out.println("Triangle: isosceles");
          break;
          } else {
          double s = (a + b + c) / 2.0;
          double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
          System.out.println("Area: " + area);
          System.out.println("Triangle: scalene");
          break;
            }
          }
      } else {
        System.out.println("Values are not correct!");
        break;

      }
    } while (a > 0 && b > 0 && c > 0);
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();
  }

}