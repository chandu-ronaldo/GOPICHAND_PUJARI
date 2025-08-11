
import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the number: ");
        
        int a = sc.nextInt();

        
        for (int i = 1; i <= a; i++) {
            System.out.print((2 * i - 1)); 
            if (i < a) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
