import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = sc.nextInt();

        if (a <=  0) {
            System.out.println(" enter the integer.");
        } 
        else {
            int group = (a + 1) / 2;     
            int count = 2 * group - 1;  
            for (int i = 0; i < count; i++) {
                System.out.print(2 * i + 1); 
                if (i < count - 1) System.out.print(", ");
         }
            System.out.println();
        }

        sc.close();
   }
}
