import java.util.Scanner;

class Chandu {
    double a;
    double b;
    String operation;

    Chandu(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
   }

    public double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("error: division by zero");
                    return Double.NaN; 
                }
            default:
                System.out.println("invalid operation");
                return Double.NaN;
        }
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("enter the  number (a): ");
        double a = sc.nextDouble();

        System.out.print("enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("enter operation (add, subtract, multiply, divide): ");
        String operation = sc.next();
        
        Chandu calc = new Chandu(a, b, operation);
        
        double result = calc.calculate();

        if (!Double.isNaN(result)) {
            System.out.println("result: " + result);
        }

        sc.close();
    }
}

