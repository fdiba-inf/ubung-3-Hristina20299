package exercise3;

import java.util.Scanner;

public class AngleCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double value = input.nextDouble();
    char type = input.next().charAt(0);
     do {
       if (type == 'r') {
        double grad = 180.0 * value / Math.PI;
        System.out.println("Angle: " + grad + " d");
        value = input.nextDouble();
        type = input.next().charAt(0);
        break;
       } else {
         double radiant = (value * Math.PI) / 180.0;
         System.out.println("Angle: " + radiant + " r");
         value = input.nextDouble();
         type = input.next().charAt(0);
         break;
       } 
    } while (type == 'r' || type == 'd');
  } 
}