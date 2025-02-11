public class QuadraticFormula {
    
    public static void main (String[] args) {
        
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        
        double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
        
    
}