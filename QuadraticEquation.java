import java.util.Scanner;

public class QuadraticEquation {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();
        
        double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
        scanner.close();
}}
