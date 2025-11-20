import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args)
       {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 :- Celsius to Fahrenheit");
        System.out.println("Enter 2 :- Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) 
         {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + (c * 9/5 + 32));
        } 
         else if (choice == 2) 
        {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Celsius: " + ((f - 32) * 5/9));
        } 
          else 
        {
            System.out.println("Invalid choice,Choose 1 or 2");
        }

        sc.close();
    }
}
