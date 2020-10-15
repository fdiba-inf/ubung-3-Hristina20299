package exercise3;

import java.util.Scanner;

public class AngleCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double value = input.nextDouble();
    char type = input.next().charAt(0);
     do {
       if (type == 'r') {
        double grad = value * (180 / Math.PI);
        System.out.println("Angle: " + grad + " d");
        break;
       } else {
         if (type == 'd');
         double radiant = value * (Math.PI / 180);
         System.out.println("Angle: " + radiant + " r");
         break;
       }
      
    } while (type == 'r' || type == 'd');
  } 
}